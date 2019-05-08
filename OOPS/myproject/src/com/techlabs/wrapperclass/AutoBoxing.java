package com.techlabs.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {
		int value=10;
		Integer myValue=value;//AutoBoxing
		System.out.println(myValue.intValue());
		printValue(20);//AutoBoxing
		
	}
	static void printValue(Integer value)
	{
		System.out.println(value.intValue());
	}
}
