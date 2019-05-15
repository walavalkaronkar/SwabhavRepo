package com.techlabs.person;

public class Person {

	private String name;
	private String address;
	private String dateOfBirth;
	
	Person(String name,String address,String dateOfBirth)
	{
		this.name=name;
		this.address=address;
		this.dateOfBirth=dateOfBirth;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getDob() {
		return dateOfBirth;
	}
	
	
}
