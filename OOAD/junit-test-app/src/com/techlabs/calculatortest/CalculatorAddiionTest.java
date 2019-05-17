package com.techlabs.calculatortest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorAddiionTest {

	@Test
	public void AdditionOfNegativeNumberGivesZero()
	{
		assertEquals(0,Calculator.addition(-2, -3));
		assertEquals(0,Calculator.addition(-2, 3));
		assertEquals(0,Calculator.addition(2, -3));
	}
	
	@Test
	public void AdditionOfPositiveNumberGivesPositiveResult()
	{
		assertEquals(0,Calculator.addition(0, 0));
		assertEquals(5,Calculator.addition(2, 3));
	}
}
