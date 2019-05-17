package com.techlabs.calculatortest;

public class Calculator {

	public static int addition(int number1,int number2)
	{
		int answer=0;
		if(number1<0 || number2<0)
		{
			return 0;
		}
		else
		{
			answer=number1+number2;
		}
			
		return answer;
	}
}
