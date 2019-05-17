package com.techlabs.unittest;

public class Square {

	public static int getSquare(int number)
	{
		int ans;
		if(number%2==0)
		{
			ans=number*number;
		}
		else
		{
			throw new EvenNumberException();
		}	
		return ans;
	}
}
