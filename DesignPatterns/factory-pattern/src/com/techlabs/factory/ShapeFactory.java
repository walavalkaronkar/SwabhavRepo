package com.techlabs.factory;



import com.techlabs.shape.Circle;
import com.techlabs.shape.Rectangle;
import com.techlabs.shape.Shape;
import com.techlabs.shape.Triangle;

public class ShapeFactory {

	public Shape getShape(String shape)
	{
		if(shape.equalsIgnoreCase("rectangle"))
		{
			return new Rectangle();
		}
		else if(shape.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		else if(shape.equalsIgnoreCase("triangle"))
		{
			return new Triangle();
		}
		return null;
	}
}
