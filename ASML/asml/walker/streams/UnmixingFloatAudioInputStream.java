package asml.walker.streams;

import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

/*
 * This is a class of Tritonus, you need to have tritonus_share.jar in the
 * classpath. Get it from http://www.tritonus.org .
 */
import org.tritonus.share.sampled.FloatSampleBuffer;

/**
 * Unmixing of multiple AudioInputStreams to one AudioInputStream. This class
 * takes a collection of AudioInputStreams and mixes them together. Being a
 * subclass of AudioInputStream itself, reading from instances of this class
 * behaves as if the mixdown result of the input streams is read.
 * <p>
 * This class uses the FloatSampleBuffer for easy conversion using normalized
 * samples in the buffers.
 * 
 * @author Florian Bomers
 * @author Matthias Pfisterer
 * @author Tim Favorite 
 * 
 * (made minor changes to MixingFloatAudioInputStream and rebranded this as
 * UnmixingFloatAudioInputStream)
 * 
 */
public class UnmixingFloatAudioInputStream extends AudioInputStream {
	private List audioInputStreamList;

	/**
	 * Attenuate the stream by how many dB per mixed stream. For example, if
	 * attenuationPerStream is 2dB, and 3 streams are mixed together, the mixed
	 * stream will be attenuated by 6dB. Set to 0 to not attenuate the signal,
	 * which will usually give good results if only 2 streams are mixed
	 * together.
	 */
	private float attenuationPerStream = 0.1f;

	/**
	 * The linear factor to apply to all samples (derived from
	 * attenuationPerStream). This is a factor in the range of 0..1 (depending
	 * on attenuationPerStream and the number of streams).
	 */
	private float attenuationFactor = 1.0f;

	private FloatSampleBuffer mixBuffer;

	private FloatSampleBuffer readBuffer;

	/**
	 * A buffer for byte to float conversion.
	 */
	private byte[] tempBuffer;

	public UnmixingFloatAudioInputStream(AudioFormat audioFormat,
			Collection<AudioInputStream> audioInputStreams) {
		super(new ByteArrayInputStream(new byte[0]), audioFormat,
				AudioSystem.NOT_SPECIFIED);
		audioInputStreamList = new ArrayList<AudioInputStream>(audioInputStreams);

		// set up the static mix buffer with initially no samples. Note that
		// using a static mix buffer prevents that this class can be used at
		// once from different threads, but that wouldn't be useful anyway. But
		// by re-using this buffer we save a lot of garbage collection.
		mixBuffer = new FloatSampleBuffer(audioFormat.getChannels(), 0,
				audioFormat.getSampleRate());

		// ditto for the read buffer. It is used for reading samples from the
		// underlying streams.
		readBuffer = new FloatSampleBuffer();

		// calculate the linear attenuation factor
		attenuationFactor = decibel2linear(-1.0f * attenuationPerStream
				* audioInputStreamList.size());
	}

	/**
	 * The maximum of the frame length of the input stream is calculated and
	 * returned. If at least one of the input streams has length
	 * <code>AudioInputStream.NOT_SPECIFIED</code>, this value is returned.
	 */
	public long getFrameLength() {
		long lLengthInFrames = 0;
		Iterator streamIterator = audioInputStreamList.iterator();
		while (streamIterator.hasNext()) {
			AudioInputStream stream = (AudioInputStream) streamIterator.next();
			long lLength = stream.getFrameLength();
			if (lLength == AudioSystem.NOT_SPECIFIED) {
				return AudioSystem.NOT_SPECIFIED;
			} else {
				lLengthInFrames = Math.max(lLengthInFrames, lLength);
			}
		}
		return lLengthInFrames;
	}

	public int read() throws IOException {
		byte[] samples = new byte[1];
		int ret = read(samples);
		if (ret != 1) {
			return -1;
		}
		return samples[0];
	}

	public int read(byte[] abData, int nOffset, int nLength) throws IOException {

		// set up the mix buffer with the requested size
		mixBuffer.changeSampleCount(nLength / getFormat().getFrameSize(), false);

		// initialize the mixBuffer with silence
		mixBuffer.makeSilence();

		// remember the maximum number of samples actually mixed
		int maxMixed = 0;

		Iterator streamIterator = audioInputStreamList.iterator();
		while (streamIterator.hasNext()) {
			AudioInputStream stream = (AudioInputStream) streamIterator.next();

			// calculate how many bytes we need to read from this stream
			int needRead = mixBuffer.getSampleCount()
					* stream.getFormat().getFrameSize();

			// set up the temporary byte buffer
			if (tempBuffer == null || tempBuffer.length < needRead) {
				tempBuffer = new byte[needRead];
			}

			// read from the source stream
			int bytesRead = stream.read(tempBuffer, 0, needRead);
			if (bytesRead == -1) {
				// end of stream: remove it from the list of streams.
				streamIterator.remove();
				continue;
			}
			// now convert this buffer to float samples
			readBuffer.initFromByteArray(tempBuffer, 0, bytesRead,
					stream.getFormat());
			if (maxMixed < readBuffer.getSampleCount()) {
				maxMixed = readBuffer.getSampleCount();
			}

			// the actual mixing routine: add readBuffer to mixBuffer
			// can only mix together as many channels as available
			int maxChannels = Math.min(mixBuffer.getChannelCount(),
					readBuffer.getChannelCount());
			for (int channel = 0; channel < maxChannels; channel++) {
				// get the arrays of the normalized float samples
				float[] readSamples = readBuffer.getChannel(channel);
				float[] mixSamples = mixBuffer.getChannel(channel);
				// Never use readSamples.length or mixSamples.length: the length
				// of the array may be longer than the actual buffer ("lazy"
				// deletion).
				int maxSamples = Math.min(mixBuffer.getSampleCount(),
						readBuffer.getSampleCount());
				// in a loop, add each "read" sample to the mix buffer
				// can only mix as many samples as available. Also apply the
				// attenuation factor.

				// Note1: the attenuation factor could also be applied only once
				// in a separate loop after mixing all the streams together,
				// saving processor time in case of many mixed streams.

				// Note2: adding everything together here will not cause
				// clipping, because all samples are in float format.
				for (int sample = 0; sample < maxSamples; sample++) {
					mixSamples[sample] -= attenuationFactor
							* readSamples[sample];
				}
			}

		} // loop over streams

		if (maxMixed == 0) {
			// nothing written to the mixBuffer
			if (audioInputStreamList.size() == 0) {
				// nothing mixed, no more streams available: end of stream
				return -1;
			}
			// nothing written, but still streams to read from
			return 0;
		}
		// finally convert the mix Buffer to the requested byte array.
		// This routine will handle clipping, i.e. if there are samples > 1.0f
		// in the mix buffer, they will be clipped to 1.0f and converted to the
		// specified audioFormat's sample format.
		mixBuffer.convertToByteArray(0, maxMixed, abData, nOffset, getFormat());
		return maxMixed * getFormat().getFrameSize();
	}

	/**
	 * calls skip() on all input streams. There is no way to assure that the
	 * number of bytes really skipped is the same for all input streams. Due to
	 * that, this method always returns the passed value. In other words: the
	 * return value is useless (better ideas appreciated).
	 */
	public long skip(long lLength) throws IOException {
		Iterator streamIterator = audioInputStreamList.iterator();
		while (streamIterator.hasNext()) {
			AudioInputStream stream = (AudioInputStream) streamIterator.next();
			stream.skip(lLength);
		}
		return lLength;
	}

	/**
	 * The minimum of available() of all input stream is calculated and
	 * returned.
	 */
	public int available() throws IOException {
		int nAvailable = 0;
		Iterator streamIterator = audioInputStreamList.iterator();
		while (streamIterator.hasNext()) {
			AudioInputStream stream = (AudioInputStream) streamIterator.next();
			nAvailable = Math.min(nAvailable, stream.available());
		}
		return nAvailable;
	}

	public void close() throws IOException {
		// TODO: should we close all streams in the list?
	}

	/**
	 * Calls mark() on all input streams.
	 */
	public void mark(int nReadLimit) {
		Iterator streamIterator = audioInputStreamList.iterator();
		while (streamIterator.hasNext()) {
			AudioInputStream stream = (AudioInputStream) streamIterator.next();
			stream.mark(nReadLimit);
		}
	}

	/**
	 * Calls reset() on all input streams.
	 */
	public void reset() throws IOException {
		Iterator streamIterator = audioInputStreamList.iterator();
		while (streamIterator.hasNext()) {
			AudioInputStream stream = (AudioInputStream) streamIterator.next();
			stream.reset();
		}
	}

	/**
	 * returns true if all input stream return true for markSupported().
	 */
	public boolean markSupported() {
		Iterator streamIterator = audioInputStreamList.iterator();
		while (streamIterator.hasNext()) {
			AudioInputStream stream = (AudioInputStream) streamIterator.next();
			if (!stream.markSupported()) {
				return false;
			}
		}
		return true;
	}

	public static float decibel2linear(float decibels) {
		return (float) Math.pow(10.0, decibels / 20.0);
	}

}

/** * MixingFloatAudioInputStream.java ** */
