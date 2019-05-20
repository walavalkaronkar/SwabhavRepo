package com.techlabs.factory.test;

import com.techlabs.factory.ShapeFactory;
import com.techlabs.shape.Shape;

public class FactoryTest {

	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape=shapeFactory.getShape("circle");
		shape.draw();
		
		shape=shapeFactory.getShape("rectangle");
		shape.draw();
		
		shape=shapeFactory.getShape("triangle");
		shape.draw();
	}
}
