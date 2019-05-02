package com.techlabs.annotations.test;

import com.techlabs.annotations.TestCase;

public class UnitTest {

	@TestCase
	public boolean methodOne()
	{
		return true;
	}
	
	@TestCase
	public boolean methodTwo()
	{
		return true;
	}

	@TestCase
	public boolean methodThree()
	{
		return false;
	}

	@TestCase
	public boolean methodFour()
	{
		return false;
	}

	@TestCase
	public boolean methodFive()
	{
		return false;
	}

}
