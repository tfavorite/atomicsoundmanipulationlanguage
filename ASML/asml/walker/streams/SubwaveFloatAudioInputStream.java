package asml.walker.streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

/**
 * Class modeled off of SequenceAudioInputStream written by Tritonus team, works somewhat akin
 * to a "substring" function where only part of the object is modified with new values.
 * @author Tim Favorite
 *
 */
public class SubwaveFloatAudioInputStream
	extends		AudioInputStream
{
	private AudioInputStream origStream;
	private AudioInputStream newStream;
	private int start;
	private int len;
	private int frameMark = 0;
	private AudioFormat format;
	private AudioInputStream currentStream;
	
	public SubwaveFloatAudioInputStream(AudioFormat audioFormat, AudioInputStream origStream, AudioInputStream newStream,
			double start, double end)
	{
		super(new ByteArrayInputStream(new byte[0]), audioFormat, AudioSystem.NOT_SPECIFIED);
		this.origStream = origStream;
		this.newStream = newStream;
		this.format = audioFormat;
		this.start = (int)((format.getFrameRate())*format.getFrameSize()*(start/1000));
		this.len = (int)((format.getFrameRate())*format.getFrameSize()*(end/1000) - this.start);
		currentStream = origStream;
	}
	
	public int read()
		throws	IOException
	{
		if (frameMark >= start && frameMark < start + len && !currentStream.equals(newStream))
			currentStream = newStream;
		else if (frameMark >= start + len && !currentStream.equals(origStream))
			currentStream = origStream;
		int	nByte = currentStream.read();
		if (nByte == -1){
			if (currentStream.equals(newStream))
			{
				currentStream = origStream;
				frameMark = start + len;
				return read();
			} else return -1;
		}
		frameMark ++;
		return nByte;
	}



	public int read(byte[] abData, int nOffset, int nLength) throws	IOException
	{
		int bytesRead = 0;
		if (frameMark >= start && frameMark < start + len && !currentStream.equals(newStream))
			currentStream = newStream;
		else if (frameMark >= start + len && !currentStream.equals(origStream))
			currentStream = origStream;
		
		if (currentStream.equals(origStream)){
			if (frameMark + nLength < start || frameMark >= start + len){
				bytesRead = currentStream.read(abData, nOffset, nLength);
				frameMark += bytesRead;
			}
			else if (frameMark < start){
				bytesRead = currentStream.read(abData, nOffset, start-frameMark);
				frameMark += bytesRead;
				if(bytesRead == -1) return -1;
				return bytesRead + read(abData, bytesRead, nLength-bytesRead);
			}	
		} else {
			if (frameMark + nLength < start + len){
				bytesRead = currentStream.read(abData, nOffset, nLength);
				frameMark += bytesRead;
			} else {
				bytesRead = currentStream.read(abData, nOffset, start + len - frameMark);
				frameMark += bytesRead;
				if(bytesRead == -1) return -1;
				return bytesRead + read(abData, bytesRead, nLength-bytesRead);
			}
		}
		return bytesRead;
	}


	public int available()
		throws	IOException
	{
		return origStream.available() + newStream.available();
	}



	public void close()
		throws	IOException
	{
		// TODO: should we close all streams in the list?
	}

	public boolean markSupported()
	{
		return false;
	}
}



/*** SequenceAudioInputStream.java ***/

