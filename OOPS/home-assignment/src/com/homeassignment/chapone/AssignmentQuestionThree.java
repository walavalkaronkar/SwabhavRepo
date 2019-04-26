package com.homeassignment.chapone;

public class AssignmentQuestionThree {

	public static void main(String[] args) {
	
		int xvalue=0;
		while(xvalue<4)
		{
			System.out.print("a");
			if(xvalue<1)
			{
				System.out.print(" ");
			}
			System.out.print("n");
			
			if(xvalue>1)
			{
				System.out.print("oyster");
				xvalue=xvalue+2;
			}
			if(xvalue==1)
			{
				System.out.print("noys");
			}
			if(xvalue<1)
			{
				System.out.print("oise");
			}
			System.out.println("");
			xvalue=xvalue+1;
		}

	}

}
