package com.mypractice.filehandling;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReading {

	public static void main(String[] args) {

		File file=new File("filedemo.txt");
		
		try
		{
			//boolean createfile=file.createNewFile();
			//System.out.println(file.getAbsolutePath());
			//System.out.println("File created"+createfile);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try
		{
			
			//readByFileInputStream();
			//readByBufferedInputStream();
			//readByDataInputStream();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void readByDataInputStream() throws IOException
	{
		InputStream in =new FileInputStream("filedemo.txt");
		DataInputStream dis=new DataInputStream(in);
		
		String s;
		while((s=dis.readLine())!=null)
		{
			System.out.println(s);
		}
		dis.close();
		in.close();
	}
	
	static void readByFileInputStream() throws IOException
	{
		int text=0;
		FileInputStream fis=new FileInputStream("filedemo.txt");
		while((text=fis.read())!=-1)
		{
			System.out.print((char)text);
		}
		fis.close();
	}
	
	static void readByBufferedInputStream() throws IOException
	{
		FileInputStream fis=new FileInputStream("filedemo.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int size=bis.available();
		byte[] input=new byte[size];
		while((bis.read(input))!=-1)
		{
			for(byte value:input)
			{
				System.out.println("--"+(char)value);
			}
		}
		bis.close();
		fis.close();
	}

}

