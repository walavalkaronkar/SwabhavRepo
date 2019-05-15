package com.techlabs.student;

public class Student implements Comparable {

	private int id;
	private int std;
	private String name;
	
	public Student (int id,int std,String name)
	{
		this.id=id;
		this.std=std;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public int getStd() {
		return std;
	}

	public String getName() {
		return name;
	}

	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + std;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (std != other.std)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object obj) {
		Student student=(Student)obj;
		return this.id-student.getId();
	}
	
	
}
