package com.techlabs.person;

import java.util.ArrayList;
import java.util.List;

public class College {

	private String collegeName;
	private List<Student> student;
	private List<Professor> professor;
	
	public College()
	{
		collegeName="SJCEM";
		student=new ArrayList<Student>();
		professor=new ArrayList<Professor>();
	}
	
	public String getCollegeName() {
		return collegeName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public List<Professor> getProfessor() {
		return professor;
	}

	public void addStudent(Student s)
	{
		student.add(s);
	}
	
	public void addProfessor(Professor p)
	{
		professor.add(p);
	}
}
