package com.techlabs.employee;

public abstract class Employee {

	private int id;
	private String name;
	private double basic;
	
	Employee(int id,String name,double basic)
	{
		this.id=id;
		this.name=name;
		this.basic=basic;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBasic() {
		return basic;
	}
	
	public abstract String displaySalaryDetails();
	public abstract void calculateSalary();
}
