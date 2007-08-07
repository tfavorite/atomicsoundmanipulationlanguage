package asml.walker.streams;

/*
 *	SequenceAudioInputStream.java
 *
 *	This file is part of jsresources.org
 */

/*
 * Copyright (c) 1999 - 2001 by Matthias Pfisterer
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
|<---            this code is formatted to fit into 80 columns             --->|
*/

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;


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

