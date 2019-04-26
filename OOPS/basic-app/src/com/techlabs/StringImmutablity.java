package com.techlabs;

public class StringImmutablity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstString="Onkar";
		String secondString= firstString;
		System.out.println("Before Strings are "+firstString +" "+secondString);
		
		firstString="walavalkar";
		System.out.println("After Strings are "+firstString +" "+secondString);
	}

}
