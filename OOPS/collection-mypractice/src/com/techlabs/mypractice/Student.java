package com.techlabs.mypractice;

import java.util.Comparator;

public class Student implements Comparable<Student> {

	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private int marks;
	
	public Student(int studentId,String studentFirstName,String studentLastName,int marks)
	{
		this.studentId=studentId;
		this.marks=marks;
		this.studentFirstName=studentFirstName;
		this.studentLastName=studentLastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "\nstudentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", marks=" + marks;
	}

	@Override
	public int compareTo(Student student) {
		if(this.studentFirstName.compareTo(student.getStudentFirstName())<0)
		{
			return -1;
		}
		else if(this.studentFirstName.compareTo(student.getStudentFirstName())>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public static Comparator<Student> SortByMarks=new Comparator<Student>()
	{
		public int compare(Student s1, Student s2) {
            return (int) (s1.getMarks() - s2.getMarks());
        }
	};
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==null || !(obj instanceof Student))
		{
			return false;
		}
		Student student=(Student)obj;
		if(student.getStudentId()==this.studentId && student.getStudentFirstName()==this.studentFirstName && student.getStudentLastName()==this.studentLastName)
		{
			if(student.getMarks()==this.marks)
			{
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return studentId;
	}
}
