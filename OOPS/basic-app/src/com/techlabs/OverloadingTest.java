package com.techlabs;

public class OverloadingTest {

		public static void main(String[] args) {
			
			//System.err.println("hello");
			//System.out.println(0);
			//System.out.println('a');
			//System.out.println(3.0);
			//System.out.println();
			int[] randomArray={1,2,3};
			//OverloadingTest t=new OverloadingTest();
			printThis('#');
			printThis("Hello");
			printThis(randomArray);
			printThis(5);
			printThis(5.5f);
			
		}
		
		private static void printThis(int integerNumber)
		{
			System.out.println(integerNumber);
		}
		private static void printThis(String stringVariable)
		{
			System.out.println(stringVariable);
		}
		private static void printThis(int[] numberArray)
		{
			for(int item:numberArray)
			{
				System.out.print(item+" ");
			}
			System.out.println();
		}
		private static void printThis(char character)
		{
			System.out.println(character);
		}
		private static void printThis(float floatingNumber)
		{
			System.out.println(floatingNumber);
		}
}
