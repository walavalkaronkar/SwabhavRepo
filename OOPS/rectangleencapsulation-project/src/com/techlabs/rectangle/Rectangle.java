package com.techlabs.rectangle;

public class Rectangle {

	private int width;
	private int height;
	private String bgColor;
	private static final int MAX=100;
	private static final int MIN=0;
	private static final String RED="red";
	private static final String GREEN="green";
	private static final String BLUE="blue";
	
	public void setWidth(int width) {
		this.width=validateValues(width);
	}
	
	public void setHeight(int height) {
		this.height=validateValues(height);
	}
	

	public void setBgColor(String bgColor) {
		this.bgColor = validateBgColor(bgColor.toLowerCase());
	}
	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}

	
	public String getBgColor() {
		return bgColor;
	}

	
	
	private int validateValues(int value)
	{
		if(value>MAX)
		{
			return MAX;
		}
		if(value<MIN)
		{
			return MIN;
		}
		return value;
		
	}
	
	
	private String validateBgColor(String bgColor)
	{
		switch(bgColor)
		{
		case RED:return RED; 
		case BLUE:return BLUE;
		case GREEN:return GREEN;	
		}
		return null;
	}
	public int calculateArea()
	{
		int area;
		area=width*height;
		return area;
	}
	
}
