package com.techlabs.proprties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

public class ReadFromPropertyFile {

	
	public void readFromFile(String starts)throws IOException {
		
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("state.properties");
		props.load(fis);
        Enumeration e=props.propertyNames();
        //String starts="m";
        while(e.hasMoreElements())
        {
        	String state=(String)e.nextElement();
        	//System.out.println(s);
        	String capital=props.getProperty(state);
        	if (capital.toLowerCase().startsWith(starts))
        	{
        		System.out.println(state);
        	}
        	
        }
	}
	
	
}
