package com.techlabs.rectangletest;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
	
		Rectangle rectangleone=new Rectangle();
		Rectangle rectangletwo=new Rectangle();
		
		rectangleone.width=15;
		rectangleone.height=7;
		
		rectangletwo.width=100;
		rectangletwo.height=20;
		
		int area=rectangleone.calculateArea();
		System.out.println("area of rectangle is of width:"+rectangleone.width+" and height:"+rectangleone.height+" is:"+area);
		
		area=rectangletwo.calculateArea();
		System.out.println("area of rectangle is of width:"+rectangletwo.width+" and height:"+rectangletwo.height+" is:"+area);
	}

}
