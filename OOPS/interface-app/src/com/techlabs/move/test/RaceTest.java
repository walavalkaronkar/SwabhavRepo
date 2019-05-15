package com.techlabs.move.test;

import com.techlabs.move.Bike;
import com.techlabs.move.Car;
import com.techlabs.move.IMoveable;
import com.techlabs.move.Truck;

public class RaceTest {

	public static void main(String[] args) {
		
		IMoveable[] array=new IMoveable[4];
		array[0]=new Car("Honda City");
		array[1]=new Bike("Yamaha");
		array[2]=new Truck("Tata Motors");
		array[3]=new Truck("Mahendra ");
		
		startRace(array);
	}
	static void startRace(IMoveable[] array)
	{
		for(IMoveable i:array)
		{
			i.move();
		}
	}
}
