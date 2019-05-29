package com.ramdomguess;

import java.util.Scanner;

public class UserGuess {

	int userGuessGumber;
	 int guessNumber()
	 {
		 System.out.println("Enter your guess");
		 Scanner scn=new Scanner(System.in);
		 userGuessGumber=scn.nextInt();	
		 return userGuessGumber;
	 }
}
