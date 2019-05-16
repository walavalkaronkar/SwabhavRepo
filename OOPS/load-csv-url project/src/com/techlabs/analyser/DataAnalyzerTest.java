package com.techlabs.analyser;

import java.io.IOException;
import java.util.HashSet;

import com.techlabs.loader.DiskFileLoader;
import com.techlabs.loader.URLFileLoader;

public class DataAnalyzerTest {

	public static void main(String[] args) throws IOException {
		
		HashSet<Employee> employee=new HashSet<Employee>();
		DiskFileLoader dfl=new DiskFileLoader();
		URLFileLoader urlf=new URLFileLoader();
		employee=urlf.loadEmployee();

		DataAnalyzer da=new DataAnalyzer();
		System.out.println("Total number of employees"+da.getEmployeeCount(employee));
		
		Employee emp;
		emp=da.getMaximumSalariedEmployee(employee);
		System.out.print("Maximum salaried Employee is ");
		System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getEmpDesignation()+" "+emp.getManagerId()+" "+emp.getSalary());
		
		System.out.println("Total number of employees in dept "+da.getTotalEmployeeByDepartment(employee, 20));
		System.out.println("Total number of Employee with Designation manager is "+da.getTotalEmployeeByDesignation(employee, "MANAGER"));
		
		HashSet<Employee> employee1= da.getEmployeeByDepartment(employee, 30);
		
		
		System.out.println();
		System.out.println("Employees with deptartment number 30");
		for(Employee e:employee1)
		{
			System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getEmpDesignation()+" "+e.getManagerId()+" "+e.getSalary());
		}
		
	}

}
