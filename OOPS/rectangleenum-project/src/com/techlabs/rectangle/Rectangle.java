package com.techlabs.rectangle;

import com.techlabs.enums.BorderColor;

public class Rectangle {

	private int width;
	private int height;
	private BorderColor bordercolor;

	private static final int MAX = 100;
	private static final int MIN = 0;

	public void setWidth(int width) {
		this.width = validateValues(width);
	}

	public void setHeight(int height) {
		this.height = validateValues(height);
	}

	public void setBordercolor(BorderColor brdcolor) {
		this.bordercolor = brdcolor;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public BorderColor getBordercolor() {
		return bordercolor;
	}

	private int validateValues(int value) {
		if (value > MAX) {
			return MAX;
		}
		if (value < MIN) {
			return MIN;
		}
		return value;

	}

	public int calculateArea() {
		int area;
		area = width * height;
		return area;
	}

}
