package com.techlabs.rectangletest;

import java.util.Scanner;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	static int  height,width;
	static String bgColor;
	public static void main(String[] args) {
		Rectangle rectangleone=new Rectangle();
		Rectangle rectangletwo=new Rectangle();
		
		takeInputOfRectangle(rectangleone);
		takeInputOfRectangle(rectangletwo);
		
		displayDetails(rectangleone);
		displayDetails(rectangletwo);
	}

	
	static void takeInputOfRectangle(Rectangle rectangle)
	{
		//Scanner scn=new Scanner(System.in);
		//System.out.println("Enter the height and width ");
		//height=scn.nextInt();
		//width=scn.nextInt();
		//System.out.println("Enter the background color");
		//bgColor=scn.next();
		//bgColor=bgColor.toLowerCase();
		
		rectangle.setHeight(12);
		rectangle.setWidth(10);
		rectangle.setBgColor("GReeN");
	}
	
	static void displayDetails(Rectangle rectangle)
	{
		int area=rectangle.calculateArea();
		System.out.println("Area of rectangle of width:"+rectangle.getWidth()+" and height:"+rectangle.getHeight()+" is:"+area);
		System.out.println("BackGround Color is:"+rectangle.getBgColor());
	}
}
