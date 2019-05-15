package com.techlabs.employee;

public class Programmer extends Employee {

	private double pa;
	public Programmer(int id,String name,double basic)
	{
		super(id,name,basic);
		pa=basic*40/100;
	}
	
	public void calculateTa()
	{
		double basic=super.getBasic();
		pa=basic*40/100;
	}
	
	public void calculateSalary()
	{
		double basic=super.getBasic();
		double salary=basic+pa;
	}
	
	public String displaySalaryDetails()
	{
		String slip="Basic is:"+super.getBasic()+"pa is:"+pa;
		return slip;
	}
}
