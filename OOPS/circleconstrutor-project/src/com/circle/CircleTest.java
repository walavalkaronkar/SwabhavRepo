package com.circle;

import com.border.BorderStyle;

public class CircleTest {

	public static void main(String[] args) {

		Circle[] circleArray=new Circle[3];
		
		Circle small=new Circle(1.5f,BorderStyle.DOUBLE_LINE);
		Circle big=new Circle(5.5f,BorderStyle.DOUBLE_LINE);
		Circle medium=new Circle(3.5f,BorderStyle.DOTTED);
		
		small.getBorder();
		circleArray[0]=small;
		circleArray[1]=big;
		circleArray[2]=medium;
		
		displayCircleDetails(circleArray);
		
		
		//System.out.println(small.calculateArea());
		//System.out.println(small.calculatePerimeter());
		//System.out.println(small.getBorder());
		
		//System.out.println(big.calculateArea());
		//System.out.println(big.calculatePerimeter());
		//System.out.println(big.getBorder());
		
		
		
	}
	

	public static void displayCircleDetails(Circle[] circleArray)
	{
		double sumOfAreaCircles=0.0;
		for(Circle c:circleArray)
		{
			System.out.println("area "+c.calculateArea());
			System.out.println("perimeter "+c.calculatePerimeter());
			sumOfAreaCircles=sumOfAreaCircles+c.calculateArea();
		}
		System.out.println("Sum of Area of Circle "+sumOfAreaCircles);
	}

}
