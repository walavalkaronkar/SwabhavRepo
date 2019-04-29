package com.techlabs.person;

import com.techlabs.gender.GenderType;

public class Person {

	private String name;
	private GenderType gender;
	private int height;
	private int weight;
	
	public Person(String name,GenderType gender,int height,int weight)
	{
		this.name=name;
		this.gender=gender;
		this.height=height;
		this.weight=weight;
	}
	
	public Person(String name,GenderType gender)
	{
		this(name,gender,150,55);
	}
	
	public String getName() {
		return name;
	}
	public GenderType getGender() {
		return gender;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	
	public void eat()
	{
		weight=weight+(int)(weight*0.01);
	}
	
	public void play()
	{
		weight= weight-(int)(weight*0.02);
	}
	
	public float calculateBMI()
	{
		float bmi;
		
		bmi=weight /(height*height/10000);
		
		return bmi;
	}
	
	public String caluclatedBMICategory(float bmi)
	{
		if(bmi<=18.5)
		{
			return "underweight";
		}
		else if(bmi<24.9)
		{
			return "Normal";
		}
		return "overweight";
	}
}
