package com.techlabs.move;

public class Bike implements IMoveable {
	String model;
	public Bike(String model)
	{
		this.model=model;
	}
	@Override
	public void move() {
		
		System.out.println(model+" Bike is moving");
	}
}
