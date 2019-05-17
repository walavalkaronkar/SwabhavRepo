package com.techlabs.analyser;

import java.util.ArrayList;
import java.util.HashSet;

public class EmployeeFetchHelper {
	
	public ArrayList<Integer> getAllDepartmentNumbers(HashSet<Employee> employee)
	{
		ArrayList<Integer> departmentNumber=new ArrayList<Integer>();
		for(Employee emp:employee)
		{
			int dNumber=emp.getDepartmentNumber();
			if(!(departmentNumber.contains(dNumber)))
			{
			departmentNumber.add(dNumber);
			}
		}
		return departmentNumber;
	}
}
