package com.techlabs.strategy;

import com.techlabs.shape.Shape;

public class ShapeStrategy {

	
	private Shape shape;

	   public void Context(Shape shape){
	      this.shape=shape;
	   }

	   public void executeStrategy(){
	      shape.draw();
	   }	
}
