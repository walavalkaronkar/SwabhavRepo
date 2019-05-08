package com.techlabs.wrapperclass;

public class AutoUnBoxing {

	public static void main(String[] args) {
		int value=10;
		Integer myValue=value;//AutoBoxing
		System.out.println(myValue);//AutounBoxing
		System.out.println(printValue(20));	//AutoBoxing and autoUnBoxing
		
	}
	static int printValue(Integer value)
	{
		System.out.println(value.intValue());
		return value;
	}

}
