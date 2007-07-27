package asml.walker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Wave extends Value {

	protected AudioInputStream mValue;
	
	public Wave(AudioInputStream aValue) {
		mType = Type.WAVE;
		mValue = aValue;
		mIsInitialized = true;
	}
	
	public Wave(AudioInputStream aValue, String aName, boolean aIsConst){
		this(aValue);
		mName = aName;
		mIsStorable = true;
		mIsConst = aIsConst;
	}
	
	public Wave(String file) throws ASMLSemanticException{
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
	
	public Wave(String file, String aName, boolean aIsConst) throws ASMLSemanticException{
		this(file);
		mName = aName;
		mIsStorable = true;
		mIsConst = aIsConst;
	}
	
	/* declaration only */
	public Wave(String aName, boolean aIsConst){
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
				coll.add(((Wave)rhs).getValue());
				return new Wave(new MixingFloatAudioInputStream(mValue.getFormat(), coll));
			default: return super.add(rhs);
		}
	}
	
	public AudioInputStream getValue(){
		return mValue;
	}

}
