package com.techlabs.dogdoor.test;

import com.techlabs.dogdoor.DogDoor;
import com.techlabs.dogdoor.Remote;

public class DogDoorTest {

	public static void main(String[] args) {
		DogDoor door=new DogDoor();
		Remote remote =new Remote(door);
		System.out.println("Fido barks to go outside");
		remote.pressButton();
		System.out.println("Fido has gone Outside");
		System.out.println("Fidos all done");
		
		try
		{
			Thread.currentThread().sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Fido is stucked outside");
		System.out.println("Fido barks");
		System.out.println("Gina grab the button");
		remote.pressButton();
		System.out.println("Fidos back inside");

	}

}
