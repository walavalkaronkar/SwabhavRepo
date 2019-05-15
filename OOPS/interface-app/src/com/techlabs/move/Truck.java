package com.techlabs.move;

public class Truck implements IMoveable {
	String model;
	public Truck(String model)
	{
		this.model=model;
	}
	@Override
	public void move() {
		
		System.out.println(model+" Truck is moving");
	}
}
