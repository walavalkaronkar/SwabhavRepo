package com.techlabs.wrapperclass;

public class UnBoxing {

	public static void main(String[] args) {
		int i=10;
		Integer myInteger=new Integer(i);
		System.out.println(myInteger.intValue());//UnBoxing
		printValue(myInteger);

	}
	static void printValue(Integer i)
	{
		int value=i.intValue();//UnBoxing
		System.out.println(value);
	}

}
