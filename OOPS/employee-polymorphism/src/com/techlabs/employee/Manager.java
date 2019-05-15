package com.techlabs.employee;

public class Manager extends Employee {

	private double hra,ta,da;
	public Manager(int id,String name,double basic)
	{
		super(id,name,basic);
		hra=basic*50/100;
		ta=basic*40/100;
		da=basic*30/100;
	}
	
	public void calculateHra()
	{
		double basic=super.getBasic();
		hra=basic*50/100;
		
	}
	
	public void calculateTa()
	{
		double basic=super.getBasic();
		ta=basic*40/100;
	}
	
	public void calculateDa()
	{
		double basic=super.getBasic();
		da=basic*30/100;
	}
	
	public void calculateSalary()
	{
		double basic=super.getBasic();
		double salary=basic+hra+da+ta;
	}
	
	public String displaySalaryDetails()
	{
		String slip= "Basic is"+super.getBasic()+" hra is: "+hra+" da is: "+da+" ta is:"+ta;
		return slip;
	}
	
}
