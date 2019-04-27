package com.ramdomguess;

public class RandomGuessTest {

	public static void main(String [] args) {
		boolean guess=false;
		int userGuess;
		int randomNumber=(int)(Math.random()*100);
		System.out.println("randomNumber"+randomNumber);
		UserGuess user=new UserGuess();
		while(guess==false)
		{
			userGuess=user.guessNumber();
			if(userGuess==randomNumber)
			{
				System.out.println("Matched");
				guess=true;
				return;
			}
			if(userGuess>randomNumber)
			{
				System.out.println("High");
			}
			else
			{
				System.out.println("Low");
			}
		}
	}

}
