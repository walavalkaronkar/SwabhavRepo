package com.techlabs.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperator {

	
	public static void readFromFile() throws IOException
	{
		FileInputStream fis=new FileInputStream("filedemo.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int size=bis.available();
		byte[] input=new byte[size];
		while((bis.read(input))!=-1)
		{
			for(byte value:input)
			{
				System.out.print((char)value);
			}
		}
		System.out.println();
		bis.close();
		fis.close();
	}
	
	public static void writeToFile(String s) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("filedemo.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		byte[] b=s.getBytes();
		bos.write(b);
		bos.close();
		System.out.println("Success");
	}
	
	public static void appendToFile(String s) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("filedemo.txt",true);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		byte[] b=s.getBytes();
		bos.write(b);
		bos.close();
		System.out.println("Success");
	}
}
