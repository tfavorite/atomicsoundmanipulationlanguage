package asml.walker.streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import org.tritonus.share.sampled.FloatSampleBuffer;

/**
 * Class modeled off of MixingAudioInputStream written by Tritonus team, multiplies
 * all samples in an AudioInputStream by a given scalar.
 * @author Tim Favorite
 *
 */
public class ScalarFloatAudioInputStream extends AudioInputStream {

	private FloatSampleBuffer readBuffer;

	/**
	 * A buffer for byte to float conversion.
	 */
	private byte[] tempBuffer;
	
	private AudioInputStream mAis;
	private float mScalar;
	
	public ScalarFloatAudioInputStream(AudioFormat format, AudioInputStream ais, double scalar){
		super(new ByteArrayInputStream(new byte[0]), format,
				AudioSystem.NOT_SPECIFIED);
		mAis = ais;
		mScalar = (float)scalar;
		readBuffer = new FloatSampleBuffer(format.getChannels(), 0,
				format.getSampleRate());
	}
	
	public int read(byte[] abData, int nOffset, int nLength) throws IOException {
		readBuffer.changeSampleCount(nLength / getFormat().getFrameSize(), false);

		// calculate how many bytes we need to read from this stream
		int needRead = readBuffer.getSampleCount()
				* mAis.getFormat().getFrameSize();

		tempBuffer = new byte[needRead];
	
		// read from the source stream
		int bytesRead = mAis.read(tempBuffer, 0, needRead);

		// now convert this buffer to float samples
		readBuffer.initFromByteArray(tempBuffer, 0, bytesRead,
				mAis.getFormat());

		for (int channel = 0; channel < readBuffer.getChannelCount(); channel++) {
			// get the arrays of the normalized float samples
			float[] readSamples = readBuffer.getChannel(channel);
			for (int sample = 0; sample < readSamples.length; sample++) {
//				float newOne = readSamples[sample] + (float)mScalar;
//				System.out.println(readSamples[sample] + " " + newOne);
				readSamples[sample] += mScalar;
			}
				
			
		}

		readBuffer.convertToByteArray(0, readBuffer.getSampleCount(), abData, nOffset, getFormat());
		return readBuffer.getSampleCount() * getFormat().getFrameSize();
	}
	
	
}
