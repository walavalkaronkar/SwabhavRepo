package com.mypractice.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		
		try
		{
			writeByFileOutputStream();
			//writeBufferedOutputStream();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
	static void writeBufferedOutputStream() throws IOException
	{
		FileOutputStream fos=new FileOutputStream("filewritedemo.txt",true);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String s="\nthis is string written by BufferedOutputStrem";
		byte[] b=s.getBytes();
		bos.write(b);
		bos.close();
		//bos=new BufferedOutputStream(new FileOutputStream("filewritedemo.txt"));
	//	s="this is second sstring";
		//b=s.getBytes();
		//bos.write(b);
		//bos.close();
		System.out.println("Success");
	}
	
	static void writeByFileOutputStream() throws IOException
	{
		FileOutputStream fos=new FileOutputStream("filewritedemo.txt",true);
		String s="\nThis is string of FileOuputStrem";
		byte[] b=s.getBytes();
		fos.write(b);
		fos.close();
		
		/*fos=new FileOutputStream("filewritedemo.txt");
		s="this is second string of FileOuputStrem";
		b=s.getBytes();
		fos.write(b);
		fos.close();*/
		System.out.println("succes");
		
	}

}
