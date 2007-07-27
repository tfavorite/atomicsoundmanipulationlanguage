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

import asml.walker.streams.MixingFloatAudioInputStream;

public class ASMLWave extends Value {

	protected AudioInputStream mValue;
	
	public ASMLWave(AudioInputStream aValue) {
		mType = Type.WAVE;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public ASMLWave(AudioInputStream aValue, String aName, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = true;
		mIsConst = aIsConst;
	}
	
	public ASMLWave(String file) throws ASMLSemanticException{
		mType = Type.WAVE;
		mIsInitialized = true;
		try {
			mValue = AudioSystem.getAudioInputStream(new File(file));
		} catch (UnsupportedAudioFileException e) {
			throw new ASMLSemanticException("Illegal file type: only WAV files are supported.");
		} catch (IOException e) {
			throw new ASMLSemanticException("File does not exist or is otherwise inaccessible at this time.");
		}
	}
	
	public ASMLWave(String file, String aName, boolean aIsConst) throws ASMLSemanticException{
		this(file);
		mName = aName;
		mIsStorable = true;
		mIsConst = aIsConst;
	}
	
	/* declaration only */
	public ASMLWave(String aName, boolean aIsConst){
		mType = Type.WAVE;
		mIsConst = aIsConst;
		mName = aName;
		mIsInitialized = false;
	}
	
	public Value add(Value rhs) throws ASMLSemanticException{
		switch(rhs.getType()){
			case Type.INT:	/* not implemented yet */
			case Type.FLOAT: /* not implemented yet */
			case Type.WAVE: 
				Collection<AudioInputStream> coll = new ArrayList<AudioInputStream>();
				coll.add(mValue);
				coll.add(((ASMLWave)rhs).getValue());
				return new ASMLWave(new MixingFloatAudioInputStream(mValue.getFormat(), coll));
			default: return super.add(rhs);
		}
	}
	
	
	/* (non-Javadoc)
	 * @see asml.walker.Value#multiply(asml.walker.Value)
	 */
	@Override
	public Value multiply(Value rhs) throws ASMLSemanticException {
		float scalar;
		switch (rhs.getType()){
			case Type.INT: 	
				scalar = ((Integer)rhs).getValue();
				break;
			case Type.FLOAT:
				scalar = (float)(((Float)rhs).getValue());
				break;
			default:
				return super.multiply(rhs);
		}
		AmplitudeAudioInputStream aais = new AmplitudeAudioInputStream(mValue);
		aais.setAmplitudeLinear(scalar);
		return new ASMLWave(aais);
		
	}

	/* (non-Javadoc)
	 * @see asml.walker.Value#amplof()
	 */
	@Override
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
		return new Amplitude((double)peak);
	}

	/* (non-Javadoc)
	 * @see asml.walker.Value#at(asml.walker.Value, asml.walker.Value)
	 */
	@Override
	public Value at(Value rhs1, Value rhs2) throws ASMLSemanticException {
		if(rhs1.getType() == Type.TIME && rhs2.getType() == Type.TIME){
			double start = ((Time)rhs1).getValue();
			double end = ((Time)rhs2).getValue();
			float frameSize = mValue.getFormat().getFrameSize();
			long fstart = (long)(start * frameSize);
			long flength = (long)((end - start)*frameSize);
			try {
				mValue.skip(fstart);
			} catch (IOException e) {
				throw new ASMLSemanticException("Cannot read from wave file!");
			}
			return new ASMLWave(new AudioInputStream(mValue, mValue.getFormat(), flength));
		} else if(rhs1.getType() == Type.FREQ && rhs2.getType() == Type.FREQ){}/* not implemented yet */
		return super.at(rhs1,rhs2);
	}

	/* (non-Javadoc)
	 * @see asml.walker.Value#at(asml.walker.Value)
	 * Fetches one sample in time or frequency domain.
	 */
	@Override
	public Value at(Value rhs) throws ASMLSemanticException {
		if(rhs.getType() == Type.TIME){
			double time = ((Time)rhs).getValue();
			float frameSize = mValue.getFormat().getFrameSize();
			long fstart = (long)(time * frameSize);
			try {
				mValue.skip(fstart);
			} catch (IOException e) {
				throw new ASMLSemanticException("Cannot read from wave file!");
			}
			return new ASMLWave(new AudioInputStream(mValue, mValue.getFormat(), 1));
		} else if(rhs.getType() == Type.FREQ){}/* not implemented yet */
		return super.at(rhs);
	}

	/* (non-Javadoc)
	 * @see asml.walker.Value#negate()
	 */
	@Override
	public Value negate() throws ASMLSemanticException {
		return multiply(new Integer(-1));
	}

	/* (non-Javadoc)
	 * @see asml.walker.Value#not()
	 */
	@Override
	public Value not() throws ASMLSemanticException {
		// TODO Auto-generated method stub
		return super.not();
	}

	/* (non-Javadoc)
	 * @see asml.walker.Value#subtract(asml.walker.Value)
	 */
	@Override
	public Value subtract(Value rhs) throws ASMLSemanticException {
		// TODO Auto-generated method stub
		return super.subtract(rhs);
	}

	public AudioInputStream getValue(){
		return mValue;
	}

}
