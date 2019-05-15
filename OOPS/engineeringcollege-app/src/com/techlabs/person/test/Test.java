package com.techlabs.person.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.enums.Branch;
import com.techlabs.person.College;
import com.techlabs.person.Person;
import com.techlabs.person.Professor;
import com.techlabs.person.Student;

public class Test {

	public static void main(String[] args) {
		Student s;
		Professor p;
		College college=new College();
		s=new Student("Onkar","virar","01jan1996",Branch.COMPS);
		college.addStudent(s);
		s=new Student("Ram","vasai","01jan1996",Branch.CIVIL);
		college.addStudent(s);
		
		p=new Professor("Shasahnk","Andheri","21Sept1992",3);
		p.calculateSalary();
		
		college.addProfessor(p);
		printCollegDetails(college);
		
		

	}
	
	public static void printCollegDetails(College college)
	{
		System.out.println("College Name"+college.getCollegeName());
		List<Student> student=new ArrayList<Student>();
		student=college.getStudent();
		List<Professor> professor=new ArrayList<Professor>();
		professor=college.getProfessor();
		
		printStudentDetails(student);
		printProfessorDetails(professor);
	}
	
	public static void printStudentDetails(List<Student> student)
	{
		System.out.println("\nStudents Details-");
		for(Student s:student)
		{
			System.out.println(s.getName()+" "+s.getAddress()+" "+s.getDob()+" "+s.getBranch());
		}
	}
	
	public static void printProfessorDetails(List<Professor> professor)
	{
		System.out.println("\nProfessor Details-");
		for(Professor p:professor)
		{
			System.out.println(p.getName()+" "+p.getAddress()+" "+p.getDob()+" "+p.getExperience()+" "+p.getSalary());
		}
	}

}
