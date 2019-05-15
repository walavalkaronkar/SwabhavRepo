package com.techlabs.move;

public class Car implements IMoveable {

	String model;
	public Car(String model)
	{
		this.model=model;
	}
	@Override
	public void move() {
		
		System.out.println(model+" car is moving");
	}

}
