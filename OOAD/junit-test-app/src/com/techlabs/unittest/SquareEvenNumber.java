package com.techlabs.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class SquareEvenNumber{

	@Test(expected= EvenNumberException.class)
	public void OddNumberGivesEvenNumberException()
	{	
		assertEquals("EvenNumberException",Square.getSquare(3));
	}
	@Test
	public void EvenNumberGivesSquareOfNumber()
	{
		int inputNumber=2;
		int expectedAnswer=4;
		int answer=Square.getSquare(inputNumber);
		assertEquals(expectedAnswer,answer);
	}
	
}
