package com.techlabs.person;


public class Professor extends Person implements SalariedEmployee {

	private float experience;
	private double salary;
	private static final int INCREMENT=1000;
	private static final int base=20000;
	public Professor(String name,String address,String dateOfBirth, float experience)
	{
		super(name, address, dateOfBirth);
		this.experience=experience;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public float getExperience()
	{
		return experience;
	}

	@Override
	public void calculateSalary() {
		
		salary=base+(INCREMENT*experience);
	}
}
