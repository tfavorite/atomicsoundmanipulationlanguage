package asml.walker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.tritonus.dsp.ais.AmplitudeAudioInputStream;
import org.tritonus.share.sampled.FloatSampleBuffer;

import asml.walker.streams.*;

public class ASMLWave extends Value {

	/**
	 * This is the representation of the wave.
	 */
	protected AudioInputStream mValue;
	
	/**
	 * Constructs an ASMLWave object from an existing AudioInputStream. This will be
	 * considered a literal and not a storable object.
	 * Example: input at 500Hz
	 * TODO is this going to be used ever?
	 * @param aValue the wave stream
	 */
	public ASMLWave(AudioInputStream aValue) {
		mType = Type.WAVE;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	/**
	 * Constructs an ASMLWave object from an existing AudioInputStream, assigns it a 
	 * name and a constant boolean value.
	 * Example: const wave fido
	 * @param aValue the wave stream
	 * @param aName the name of the object
	 */
	public ASMLWave(AudioInputStream aValue, String aName){
		this(aValue);
		mName = aName;
		mIsStorable = true;
	}
	
	/**
	 * Constructs an ASMLWave object from a name and a boolean constant value (declaration)
	 * Example: wave b
	 * @param aName the name of the object
	 */
	public ASMLWave(String aName){
		mType = Type.WAVE;
		mName = aName;
		mIsInitialized = false;
	}
	
	/**
	 * Adds a value (rhs) to this wave. Rhs can either be an int, a float, or a wave.
	 * If it is an int or float it essentially acts as a vertical shift operation. If it
	 * is a wave, it will mix this wave and the rhs wave together.
	 * @param rhs the right hand side of the addition
	 * @return the result of the add operation
	 */
	public Value add(Value rhs) throws ASMLSemanticException{
		float scalar;
		switch(rhs.getType()){
			case Type.INT:	
				scalar = ((ASMLInteger)rhs).getValue();
				break;
			case Type.FLOAT:
				scalar = (float)((ASMLFloat)rhs).getValue();
				break;
			case Type.WAVE: 
				Collection<AudioInputStream> coll = new ArrayList<AudioInputStream>();
				coll.add(mValue);
				coll.add(((ASMLWave)rhs).getValue());
				return new ASMLWave(new MixingFloatAudioInputStream(mValue.getFormat(), coll));
			default: return super.add(rhs);
		}
		// Just ints and floats left
		int samplecount = 8192;
		AmplitudeAudioInputStream aais = new AmplitudeAudioInputStream(mValue, mValue.getFormat());
		FloatSampleBuffer buffer = new FloatSampleBuffer(mValue.getFormat().getChannels(), samplecount, mValue.getFormat().getSampleRate());
		float[] channel;
		aais.read(buffer);
		while(buffer.getSampleCount() > 0){
			for(int i=0; i<buffer.getChannelCount(); i++){
				channel = buffer.getChannel(i);
				for(int j=0; j<channel.length; j++)	channel[j] += scalar;
			}
			aais.read(buffer);
		}
		return new ASMLWave(aais);
	}
	
	
	/**
	 * Multiplies this wave by an int or a float, changing the amplitude of the wave
	 *  by that factor.
	 * @param rhs the int or float value by which the wave is multiplied.
	 * @return modified wave
	 */
	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		float scalar;
		switch (rhs.getType()){
			case Type.INT: 	
				scalar = ((ASMLInteger)rhs).getValue();
				break;
			case Type.FLOAT:
				scalar = (float)(((ASMLFloat)rhs).getValue());
				break;
			default:
				return super.multiply(rhs);
		}
		AmplitudeAudioInputStream aais = new AmplitudeAudioInputStream(mValue);
		aais.setAmplitudeLinear(scalar);
		return new ASMLWave(aais);
		
	}

	/**
	 * Returns the amplitude of this wave.
	 * @return the amplitude
	 */
	public Value amplof() throws ASMLSemanticException {
		// TODO 8192 is a totally arbitrary size for the buffer - maybe we'll try different values to see which one gives best performance
		int samplecount = 8192;
		AmplitudeAudioInputStream aais = new AmplitudeAudioInputStream(mValue, mValue.getFormat());
		FloatSampleBuffer buffer = new FloatSampleBuffer(mValue.getFormat().getChannels(), samplecount, mValue.getFormat().getSampleRate());
		float[] channel;
		float peak = 0;
		aais.read(buffer);
		while(buffer.getSampleCount() > 0){
			for(int i=0; i<buffer.getChannelCount(); i++){
				channel = buffer.getChannel(i);
				for(int j=0; j<channel.length; j++){
					if(Math.abs(channel[j]) > peak) peak = Math.abs(channel[j]);
				}
			}
			aais.read(buffer);
		}
		return new ASMLAmplitude((double)peak);
	}

	/**
	 * Constructs a wave made up of a range of samples in the time or frequency domain.
	 * rhs1 and rhs2 must be of same type, and can only be time or frequency values.
	 * @param rhs1 the beginning of range
	 * @param rhs2 the end of the range
	 * @return the range of samples
	 */
	public Value at(Value rhs1, Value rhs2) throws ASMLSemanticException {
		if(rhs1.getType() == Type.TIME && rhs2.getType() == Type.TIME){
			double start = ((ASMLTime)rhs1).getValue();
			double end = ((ASMLTime)rhs2).getValue();
			float frameSize = mValue.getFormat().getFrameSize();
			long fstart = (long)(start * frameSize);
			long flength = (long)((end - start)*frameSize);
			try {
				mValue.skip(fstart);
			} catch (IOException e) {
				throw new ASMLSemanticException("Cannot read from wave file!");
			}
			return new ASMLWave(new AudioInputStream(mValue, mValue.getFormat(), flength));
		} else if(rhs1.getType() == Type.FREQ && rhs2.getType() == Type.FREQ){
			/* Windowed-sinc implementation */
			float[] filter = windowedSinc(((ASMLFrequency)rhs1).getValue(), ((ASMLFrequency)rhs2).getValue());
			return new ASMLWave(new ConvolvingFloatAudioInputStream(mValue.getFormat(), mValue, filter));
		}
		return super.at(rhs1,rhs2);
	}

	/**
	 * Constructs a wave made up of one sample in the time or frequency domain.
	 * Rhs must be of type time or frequency.
	 * @param rhs the time or frequency specifier
	 * @return a wave with that one sample
	 */
	public Value at(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() == Type.TIME){
			double time = ((ASMLTime)rhs).getValue();
			float frameSize = mValue.getFormat().getFrameSize();
			long fstart = (long)(time * frameSize);
			try {
				mValue.skip(fstart);
			} catch (IOException e) {
				throw new ASMLSemanticException("Cannot read from wave file!");
			}
			return new ASMLWave(new AudioInputStream(mValue, mValue.getFormat(), 1));
		} else if(rhs.getType() == Type.FREQ){
			// This too, is a range, but a range of 1 - rhs to rhs + 1...
			double freq = ((ASMLFrequency)rhs).getValue();
			float[] filter = windowedSinc(freq, freq + 1.0);
			return new ASMLWave(new ConvolvingFloatAudioInputStream(mValue.getFormat(), mValue, filter));
		}
		return super.at(rhs);
	}

	/**
	 * Multiplies wave by -1, essentially performing an inversion.
	 * @return the inverted wave
	 */
	public Value negate() throws ASMLSemanticException {
		return multiply(new ASMLInteger(-1));
	}

	/**
	 * Subtracts a value (rhs) from this wave. Rhs can either be an int, a float, or a wave.
	 * If it is an int or float it essentially acts as a vertical shift operation. If it
	 * is a wave, it will unmix the rhs wave from this wave.
	 * @param rhs the right hand side of the addition
	 * @return the result of the subtract operation
	 */
	@Override
	public Value subtract(Value rhs) throws ASMLSemanticException {
		float scalar;
		switch(rhs.getType()){
			case Type.INT:	
				scalar = ((ASMLInteger)rhs).getValue();
				break;
			case Type.FLOAT:
				scalar = (float)((ASMLFloat)rhs).getValue();
				break;
			case Type.WAVE: 
				Collection<AudioInputStream> coll = new ArrayList<AudioInputStream>();
				coll.add(mValue);
				coll.add(((ASMLWave)rhs).getValue());
				return new ASMLWave(new UnmixingFloatAudioInputStream(mValue.getFormat(), coll));
			default: return super.add(rhs);
		}
		// Just ints and floats left
		int samplecount = 8192;
		AmplitudeAudioInputStream aais = new AmplitudeAudioInputStream(mValue, mValue.getFormat());
		FloatSampleBuffer buffer = new FloatSampleBuffer(mValue.getFormat().getChannels(), samplecount, mValue.getFormat().getSampleRate());
		float[] channel;
		aais.read(buffer);
		while(buffer.getSampleCount() > 0){
			for(int i=0; i<buffer.getChannelCount(); i++){
				channel = buffer.getChannel(i);
				for(int j=0; j<channel.length; j++)	channel[j] -= scalar;
			}
			aais.read(buffer);
		}
		return new ASMLWave(aais);
	}

	/** Gets the AudioInputStream from this wave.
	 * 
	 * @return the AudioInputStream representing this wave
	 */
	public AudioInputStream getValue(){
		return mValue;
	}
	
	/* Windowed-sinc filter generator. The filter generation would likely be more efficient
	 * using Fast Fourier Transform (FFT), but as this was easier to learn for a DSP
	 * novice, here's this instead.
	 */
	private float[] windowedSinc(double start, double end){
		double sum;
		int windowSize = 800;
		if (windowSize % 2 == 1) windowSize += 1;
		
		double lower[] = new double[windowSize + 1];
		double upper[] = new double[windowSize + 1];
		double filter[] = new double[windowSize + 1];
		double fstart = start/mValue.getFormat().getSampleRate();
		double fend = end/mValue.getFormat().getSampleRate();
		
		//calculate lower - it's a low pass filter with cutoff of start
		for (int i=0; i<=windowSize; i++){
			if(i == windowSize/2) lower[i] = 2 * Math.PI * fstart;
			else lower[i] = Math.sin(2*Math.PI*fstart*(i-windowSize/2))/(i-windowSize/2);
			
			lower[i] = lower[i] * (0.42-0.5*Math.cos(2*Math.PI*i/windowSize)+0.08*Math.cos(4*Math.PI*i/windowSize));	
		}
		
		// normalize lower
		sum = 0.0;
		for (int i=0; i<=windowSize; i++) sum +=lower[i];
		for (int i=0; i<=windowSize; i++) lower[i] = lower[i]/sum;
		
		// same thing for upper now, cutoff is end instead of start
		for (int i=0; i<=windowSize; i++){
			if(i == windowSize/2) upper[i] = 2 * Math.PI * fend;
			else upper[i] = Math.sin(2*Math.PI*fend*(i-windowSize/2))/(i-windowSize/2);
			
			upper[i] = upper[i] * (0.42-0.5*Math.cos(2*Math.PI*i/windowSize)+0.08*Math.cos(4*Math.PI*i/windowSize));	
		}
		
		// normalize upper
		sum = 0.0;
		for (int i=0; i<=windowSize; i++) sum +=upper[i];
		for (int i=0; i<=windowSize; i++) upper[i] = upper[i]/sum;		
		
		// now change upper into a high-pass filter using spectral inversion
		for (int i=0; i<=windowSize; i++) upper[i] = -upper[i];
		upper[windowSize/2] += 1.0;
		
		// now add lower and upper to make a band-reject filter
		for (int i=0; i<=windowSize; i++) filter[i] = lower[i] + upper[i];
		
		//do spectral inversion on band-reject filter to make our band-pass filter!
		for (int i=0; i<=windowSize; i++) filter[i] = -filter[i];
		filter[windowSize/2] += 1.0;
			
		// Convert to float array for use with ConvolvingFloatAudioInputStream
		float[] floatfilter = new float[windowSize + 1];
		for (int i=0; i<=windowSize; i++) floatfilter[i] = (float)filter[i];
		return floatfilter;
	}

}
