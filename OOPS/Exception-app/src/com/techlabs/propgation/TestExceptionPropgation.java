package com.techlabs.propgation;

public class TestExceptionPropgation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try{
		m1();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of main");
	}

	static void m1() throws Exception
	{
		System.out.println("Inside m1");
		m2();
	}
	static void m2() throws Exception
	{
		System.out.println("Inside m2");
		m3();
	}
	static void m3() throws Exception
	{
		System.out.println("Inside m3");
		throw new Exception("Exception in m3");
	}
}
