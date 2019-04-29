package com.circle;

import com.border.BorderStyle;

public class Circle {
	private float radius;
	private BorderStyle border;
	private static final double PI =3.14;
	
	
	public BorderStyle getBorder() {
		return border;
	}

	public Circle(float radius,BorderStyle border)
	{
		this.radius=radius;
		this.border=border;
	}
	
	public Circle(float radius)
	{
		this.radius=radius;
		border=BorderStyle.SINGLE_LINE;
	}
	
	public double calculateArea()
	{
		double area;
		area=PI*radius*radius;
		return area;
	}
	
	public double calculatePerimeter()
	{
		double perimeter;
		perimeter=2*PI*radius;
		return perimeter;
	}
	
	
}
