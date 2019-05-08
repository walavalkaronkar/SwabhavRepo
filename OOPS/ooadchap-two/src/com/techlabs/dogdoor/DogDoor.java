package com.techlabs.dogdoor;

public class DogDoor {

	private boolean open;
	public DogDoor()
	{
		this.open=false;
	}
	
	public void open()
	{
		System.out.println("the Dog door Open");
		open=true;
	}
	
	public void close()
	{
		System.out.println("The dog door is closed");
	}
	
	public boolean isOpen()
	{
		return open;
	}
}
