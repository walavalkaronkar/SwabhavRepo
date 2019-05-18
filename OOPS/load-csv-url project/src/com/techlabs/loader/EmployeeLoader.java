package com.techlabs.loader;

import java.util.HashSet;

import com.techlabs.analyser.Employee;

public class EmployeeLoader {

	public HashSet<Employee> loadEmployee(HashSet<Employee> emp,String s)
	{
		String[] details=s.split(",");
		Employee employee=new Employee();
		employee.setEmployeeId(Integer.parseInt(details[0]));
		employee.setEmployeeName(details[1].substring(1, details[1].length()-1));
		employee.setEmpDesignation(details[2].substring(1, details[2].length()-1));
		employee.setManagerId(details[3]);
		employee.setDateOfJoining(details[4].substring(1, details[4].length()-1));
		employee.setSalary(Double.parseDouble(details[5]));
		employee.setCommision(details[6]);
		employee.setDepartmentNumber(Integer.parseInt(details[7]));
		
		emp.add(employee);
		return emp; 
	}
}
