package com.techlabs.filehandling.test;

import com.techlabs.filehandling.FileOperator;

public class FileOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="\nthis is string written by BufferedOutputStream";
		try
		{
			FileOperator.readFromFile();
			FileOperator.writeToFile(s);
			FileOperator.appendToFile(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
