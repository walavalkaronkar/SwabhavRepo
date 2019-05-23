package com.techlabs.composite;

public class Cashier implements Employee{

	private int id;
	private String name;
	private double salary;

	public Cashier(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	@Override
	public int getId() {
		return id;
	}


}
