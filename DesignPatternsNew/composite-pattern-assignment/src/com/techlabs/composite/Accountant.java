package com.techlabs.composite;

public class Accountant implements Employee {

	private int id;
	private String name;
	private double salary;

	public Accountant(int id, String name, double salary) {
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
	}
}
