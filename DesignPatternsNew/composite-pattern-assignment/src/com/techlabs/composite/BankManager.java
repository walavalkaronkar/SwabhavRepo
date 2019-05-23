package com.techlabs.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee {

	private int id;
	private String name;
	private double salary;
	List<Employee> employees = new ArrayList<Employee>();


	public BankManager(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void printDetails() {
		System.out.println("Id =" + getId());
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());

		Iterator<Employee> it = employees.iterator();

		while (it.hasNext()) {
			Employee employee = it.next();
			employee.printDetails();
		}
	}
	


	public void add(Employee employee) {
		employees.add(employee);
	}

	public Employee getChild(int i) {
		return employees.get(i);
	}

	public void remove(Employee employee) {
		employees.remove(employee);
	}
}
