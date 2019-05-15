package com.techlabs.proprties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class GiveList {

	Properties props; 
	FileInputStream fis;
	public GiveList() throws IOException
	{
		props = new Properties();
		fis = new FileInputStream("state.properties");
		props.load(fis);
	}
	public List giveAllStates() throws IOException
	{
		List list=new ArrayList();
		//Properties props = new Properties();
		
		
        Enumeration e=props.propertyNames();
        while(e.hasMoreElements())
        {
        	String state=(String)e.nextElement();
        	list.add(state);
        }
		return list;
	}
	
	public List giveListOfCapitals() throws IOException
	{
		List list=new ArrayList();
		List states= giveAllStates();
		Iterator state=states.iterator();
        while(state.hasNext())
        {
        		
        	String s=(String)state.next();
        	//System.out.println(s);
        	String capital=props.getProperty(s);
        	list.add(capital);
        	
        }
        return list;
	}
	
	public String getCaptial(String state)
	{
		String capital=props.getProperty(state);
		return capital;
	}
}
