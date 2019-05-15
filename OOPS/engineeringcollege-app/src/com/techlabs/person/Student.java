package com.techlabs.person;

import com.techlabs.enums.Branch;

public class Student extends Person{
	
	private String clas;
	private Branch branch;
	
	public Student(String name,String address,String dateOfBirth,Branch branch)
	{
		super(name,address,dateOfBirth);
		this.branch=branch;
	}

	public Branch getBranch() {
		return branch;
	}
	
	

}
