package com.techlabs.filehandling.test;

import com.techlabs.filehandling.FileOperation;

public class FileOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="\nthis is string written by BufferedOutputStream";
		try
		{
			FileOperation.readFromFile();
			FileOperation.writeToFile(s);
			FileOperation.appendToFile(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
