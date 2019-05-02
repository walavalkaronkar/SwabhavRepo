package com.techlabs.evenodd.test;

import com.techlabs.evenodd.Even;
import com.techlabs.evenodd.Odd;
import com.techlabs.evenodd.OddEven;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxValue = 100;
		OddEven oddeven = new OddEven();
		oddeven.setMaxValue(20);
		Even[] even = oddeven.giveEvenNumber();
		oddeven.printEvenNumber(even);
		
		Odd[] odd = oddeven.giveOddNumber();
		oddeven.printOddNumber(odd);
		

	}
}
