package com.techlabs.analyser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

import com.techlabs.loader.DiskFileLoader;
import com.techlabs.loader.URLFileLoader;

public class DataAnalyzerTest {

	public static void main(String[] args) throws IOException {
		
		HashSet<Employee> employee=new HashSet<Employee>();
		DiskFileLoader dfl=new DiskFileLoader();
		//URLFileLoader urlf=new URLFileLoader();
		//EmployeeFetchHelper efh=new EmployeeFetchHelper();
		employee=dfl.loadEmployee();

		for(Employee employee1: employee)
		{
			System.out.println(employee1);
		}
		System.out.println(employee.size());
		DataAnalyzer da=new DataAnalyzer();
		/*
		System.out.println("Total number of employees "+da.getEmployeeCount(employee));
		
		Employee emp;
		emp=da.getMaximumSalariedEmployee(employee);
		System.out.print("Maximum salaried Employee is ");
		System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getEmpDesignation()+" "+emp.getManagerId()+" "+emp.getSalary());
		
		System.out.println("Total number of employees in dept "+da.getTotalEmployeeByDepartment(employee, 20));
		System.out.println("Total number of Employee with Designation manager is "+da.getTotalEmployeeByDesignation(employee, "MANAGER"));
		
		
		System.out.println();
		
		Map<Integer,Integer> departmentCount=da.getEmployeeDepartmentWiseCount(employee);
		
		departmentCount.entrySet();
		
		for(Map.Entry m:departmentCount.entrySet()){    
		       System.out.println("Department Number "+m.getKey()+" Number of Employees "+m.getValue());    
		      }  
		      */
		
		/*ArrayList<Integer> dNumberList=efh.getAllDepartmentNumbers(employee);
		for(int departmentNumber:dNumberList)
		{
			HashSet<Employee> employee1= da.getEmployeeByDepartment(employee,departmentNumber);
			System.out.println("Employees with department number"+departmentNumber);
			for(Employee e:employee1)
			{
				System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getEmpDesignation()+" "+e.getManagerId()+" "+e.getSalary());
			}
		}*/
		
	}

}
