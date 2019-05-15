package com.techlabs.exception.test;

public class TestBug {

	public static void main(String[] args) {
		
		
		int a=Integer.parseInt(args[0]);	//ArrayIndexOutOfExceptions //NumberFormatException
		int b=Integer.parseInt(args[1]);
		int c=a/b;			//AirthemeticException
		System.out.println(c); 
		
	}

}
