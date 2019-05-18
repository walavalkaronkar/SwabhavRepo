package com.techlabs.analyser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DataAnalyzer {

	public int getEmployeeCount(HashSet<Employee> employee)
	{
		return employee.size();
	}
	
	public Employee getMaximumSalariedEmployee(HashSet<Employee> employee)
	{
		int maximum=0;
		Employee e=null;;
		for(Employee emp:employee)
		{
			if(emp.getSalary()> maximum)
			{
				e=emp;
			}
		}
		return e;
	}
	
	public int getTotalEmployeeByDesignation(HashSet<Employee> employee,String designation)
	{
		int total=0;
		for(Employee emp:employee)
		{
			if(emp.getEmpDesignation().equalsIgnoreCase(designation))
			{
				total++;
			}
		}
		return total;
	}
	
	public int getTotalEmployeeByDepartment(HashSet<Employee> employee,int departmentNumber)
	{
		int total=0;
		for(Employee emp:employee)
		{
			if(emp.getDepartmentNumber()==departmentNumber)
			{
				total++;
			}
		}
		return total;
	}
	
	public HashSet<Employee> getEmployeeByDepartment(HashSet<Employee> employee,int departmentNumber)
	{
		HashSet<Employee> emp=new HashSet<Employee>();
		for(Employee e:employee)
		{
			if(e.getDepartmentNumber()==departmentNumber)
			{
				emp.add(e);
			}
		}
		
		return emp;
		
	}	
	public Map<Integer,Integer> getEmployeeDepartmentWiseCount(HashSet<Employee> employee)
	{
		Map<Integer,Integer> departmentCount=new HashMap<Integer,Integer>();
		for(Employee e:employee)
		{
			if(departmentCount.containsKey(e.getDepartmentNumber()))
			{
				int count=departmentCount.get(e.getDepartmentNumber());
				count++;
				departmentCount.put(e.getDepartmentNumber(), count);
			}
			else
			{
				departmentCount.put(e.getDepartmentNumber(), 1);
			}
			//if(e.getDepartmentNumber())
		}
		return departmentCount;
	}
	
}
