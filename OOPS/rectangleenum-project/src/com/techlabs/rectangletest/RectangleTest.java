package com.techlabs.rectangletest;

import java.util.Scanner;

import com.techlabs.enums.BorderColor;
import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	static int height, width;
	static String bgColor;

	public static void main(String[] args) {
		Rectangle big = new Rectangle();
		Rectangle small = new Rectangle();
		
		takeInputOfRectangle(big);

		//displayDetails(big);
		displayDetails(new Rectangle());

	}

	static void takeInputOfRectangle(Rectangle rectangle) {

		rectangle.setHeight(12);
		rectangle.setWidth(10);

		rectangle.setBordercolor(BorderColor.BLUE);
	}

	static void displayDetails(Rectangle rectangle) {
		
		int area = rectangle.calculateArea();
		System.out.println("Border Color :" + rectangle.getBordercolor());
		
		System.out.println("area of anonymous object is:"+new Rectangle().calculateArea());
		
		//Rectangle temp=null;
		//System.out.println("Area of rectangle of width:" + rectangle.getWidth() + " and height:" + rectangle.getHeight()
		//		+ " is:" + area);
		//System.out.println("Border Color of temp object is:"+temp.getBordercolor());
		//temp.setBordercolor(BorderColor.RED);
		//System.out.println("Border Color of temp object is:"+temp.getBordercolor());
		//System.out.println("Border Color :" + rectangle.getBordercolor());
	}
}
