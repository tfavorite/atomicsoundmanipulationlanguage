package asml.walker.streams;

/**
 * A class modeled on the MixingFloatAudioInputStream written by Florian Bomers
 * and Mathias Pfisterer of the Tritonus team, it takes an AudioInputStream and 
 * an array of floats representing a filter and then convolves the data from the 
 * stream with the filter as the user reads from it.
 * @author Tim Favorite
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

import org.tritonus.lowlevel.dsp.FIR;
import org.tritonus.share.sampled.FloatSampleBuffer;

public class ConvolvingFloatAudioInputStream extends AudioInputStream {

	private FIR filter;
	private FloatSampleBuffer wavebuffer;
	private AudioInputStream ais;
	
	/**
	 * Creates a ConvolvingFloatAudioInputStream
	 * @param audioFormat format of the AudioInputStream
	 * @param ais the AudioInputStream
	 * @param coeffs the float array which is the filter
	 */
	public ConvolvingFloatAudioInputStream(AudioFormat audioFormat, AudioInputStream ais, float[] coeffs) {
		super(new ByteArrayInputStream(new byte[0]), audioFormat,
				AudioSystem.NOT_SPECIFIED);
		filter = new FIR(coeffs);
		wavebuffer = new FloatSampleBuffer(audioFormat.getChannels(), 0,
				audioFormat.getSampleRate());
		this.ais = ais;
	}

	/**
	 * Reads from stream
	 * @param data byte array to be read into
	 * @param offset where in byte array to start reading into
	 * @param length how many bytes to read
	 * @returns number of bytes read
	 * @throws IOException if there was a problem reading from stream
	 */
	public int read(byte[] data, int offset, int length) throws IOException {
		//initialize wavebuffer
		wavebuffer.changeSampleCount(length/getFormat().getFrameSize(), false);
		wavebuffer.makeSilence();
		
		// how many bytes are we going to need to read in? samples * size of frame (in bytes)
		int needRead = wavebuffer.getSampleCount() * ais.getFormat().getFrameSize();
		byte[] tempbuff = new byte[needRead];
		
		int bytesRead = ais.read(tempbuff, 0, needRead);
		if (bytesRead == -1) return -1;
		
		wavebuffer.initFromByteArray(tempbuff, 0, bytesRead, ais.getFormat());
		int count = wavebuffer.getSampleCount();
		
		// manipulating samples will actually manipulate wavebuffer as well
		float[] samples = wavebuffer.getChannel(0);
		for (int i=0;i<samples.length;i++){
			samples[i] = filter.process(samples[i]);
		}
		wavebuffer.convertToByteArray(0, count, data, offset, getFormat());
		return count * getFormat().getFrameSize();
	}
}
