package com.techlabs.strategy.test;

import com.techlabs.shape.Rectangle;
import com.techlabs.strategy.ShapeStrategy;

public class TestShape {

	public static void main(String[] args) {
		ShapeStrategy shapeStraregy=new ShapeStrategy();
		shapeStraregy.Context(new Rectangle());
		shapeStraregy.executeStrategy();

	}

}
