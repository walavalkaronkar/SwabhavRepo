package com.techlabs.human.test;

import com.techlabs.human.Boy;
import com.techlabs.human.Infant;
import com.techlabs.human.Kid;
import com.techlabs.human.Man;

public class HumanTest {

	public static void main(String[] args) {
		
		int choice=4;
		switch(choice)
		{
			case 1:	Man man=new Man();
					man.eat();
					man.play();
					man.read();
					break;
					
			case 2: Boy boy=new Boy();
					boy.eat();
					boy.play();
					boy.read();
					boy.walk();
					break;
					
			case 3:	Man manOne= new Boy();
					manOne.eat();
					manOne.play();
					manOne.read();
				  	break;
				  	
			case 4: atThePark(new Man()); 
					atThePark(new Boy());
					atThePark(new Kid());
					atThePark(new Infant());
					break;
		
		}
	}
	
	public static void atThePark(Man man)
	{
		System.out.println("At the parks");
		man.play();
	}
}
