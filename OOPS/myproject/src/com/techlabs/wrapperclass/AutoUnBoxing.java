package com.techlabs.wrapperclass;

public class AutoUnBoxing {

	public static void main(String[] args) {
		int value=10;
		Integer myValue=value;//AutoBoxing
		System.out.println(myValue);//AutoUnBoxing
		System.out.println(printValue(20));	
		
	}
	static int printValue(Integer value) //Autoboxing
	{
		System.out.println(value.intValue());
		return value;
	}

}
