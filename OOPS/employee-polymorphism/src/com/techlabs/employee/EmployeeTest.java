package com.techlabs.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1=new Manager(1, "Ram", 16000);
		e1.calculateSalary();
		printDetails(e1);
		Employee e2=new Programmer(0, "onkar", 12000);
		e2.calculateSalary();
		printDetails(e2);
		Employee e3=new Accountant(3, "Sham", 10000);
		e3.calculateSalary();
		printDetails(e3);

	}

	public static void printDetails(Employee emp)
	{
		String slip=emp.displaySalaryDetails();
		System.out.println(slip);
	}
}
