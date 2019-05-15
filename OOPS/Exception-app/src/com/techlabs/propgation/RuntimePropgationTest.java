package com.techlabs.propgation;

public class RuntimePropgationTest {

	public static void main(String[] args) throws RuntimeException {
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

	static void m1()
	{
		System.out.println("Inside m1");
		m2();
	}
	static void m2()
	{
		System.out.println("Inside m2");
		m3();
	}
	static void m3()
	{
		System.out.println("Inside m3");
		throw new RuntimeException("Runtime Exception in m3");
	}

}
