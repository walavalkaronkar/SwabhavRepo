package com.techlabs.employee;

public class Accountant extends Employee {

	private double perks;
	public Accountant(int id,String name,double basic)
	{
		super(id,name,basic);
		perks=basic*40/100;
	}
	
	public void calculatePerks()
	{
		double basic=super.getBasic();
		perks=basic*40/100;
	}
	
	public void calculateSalary()
	{
		double basic=super.getBasic();
		double salary=basic+perks;
	}
	
	public String displaySalaryDetails()
	{
		String slip = "Basic is:"+super.getBasic()+"pa is:"+perks;
		return slip;
	}
}
