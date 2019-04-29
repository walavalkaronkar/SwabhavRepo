package com.techlabs.persontest;

import com.techlabs.gender.GenderType;
import com.techlabs.person.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personOne=new Person("Ram",GenderType.MALE,160,60);
		float bmi=personOne.calculateBMI();
		String bmiCategory = personOne.caluclatedBMICategory(bmi);
		System.out.println(bmiCategory);
		
		while(bmiCategory.equalsIgnoreCase("overweight"))
		{
			personOne.play();
			System.out.println("Play");
			bmi=personOne.calculateBMI();
			bmiCategory = personOne.caluclatedBMICategory(bmi);
			System.out.println (personOne.getWeight()+" "+bmi +" "+bmiCategory);
		}

	}

}
