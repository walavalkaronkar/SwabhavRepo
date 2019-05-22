package com.techlabs.automobile.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;

import com.techlabs.automobile.BMWFactory;
import com.techlabs.automobile.IAutoMobile;
import com.techlabs.automobile.IAutoMobileFactory;

public class AutoMobileTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		//IAutoMobileFactory autoFactory=BMWFactory.getInstance();
		//IAutoMobile autoMobile=autoFactory.make();
		//autoMobile.start();
		//autoMobile.stop();
		
		
		String className=loadFromProperties();
		Class auto=Class.forName(className);
		
		Constructor con=auto.getDeclaredConstructor();
	    con.setAccessible(true);     
		Object bmw=con.newInstance();
	    Method getMethod = bmw.getClass().getMethod("getInstance");
	    
	    IAutoMobileFactory instance=(IAutoMobileFactory)getMethod.invoke(bmw);
	    IAutoMobile automobile=instance.make();
	    automobile.start();
	    automobile.stop();

	
	}
	
	
	public static String loadFromProperties() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		String automobile=null;
		ClassLoader classLoader = AutoMobileTest.class.getClassLoader();
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("automobile.properties");
		props.load(fis);
        Enumeration e=props.propertyNames();
        while(e.hasMoreElements())
        {
        	automobile=props.getProperty((String)e.nextElement());
        	System.out.println(automobile);
             
        }
        fis.close();
        return automobile;
	}
}
