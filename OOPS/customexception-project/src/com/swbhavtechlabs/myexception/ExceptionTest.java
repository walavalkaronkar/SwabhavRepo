package com.swbhavtechlabs.myexception;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		int number;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the odd Number for cubing");
		number=scn.nextInt();
		Even even=new Even();
		if(!(even.isEven(number)))
		{
			System.out.println("Cube of the number is :"+number*number*number);
		}
		
		

	}

}
