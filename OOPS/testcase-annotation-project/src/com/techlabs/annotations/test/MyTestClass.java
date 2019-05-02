package com.techlabs.annotations.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.annotations.TestCase;

public class MyTestClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String c="com.techlabs.annotations.test.UnitTest";
		Class classname=Class.forName(c);
		int counttrue=0;
		int countfalse=0;
		Object obj=classname.newInstance();
		for(Method m:classname.getMethods())
		{
			TestCase testcase= (TestCase) m.getAnnotation(TestCase.class);
			if(testcase!=null)
			{
				boolean value= (boolean)m.invoke(obj);
				if(value==true)
				{
					counttrue++;
				}
				else
				{
					countfalse++;
				}
				
			}
			
			
			
		}
		System.out.println("Unpassed methods are "+countfalse+"Passed Methods are"+counttrue );

	}

}
