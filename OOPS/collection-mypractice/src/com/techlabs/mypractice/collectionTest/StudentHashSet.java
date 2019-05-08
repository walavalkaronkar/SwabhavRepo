package com.techlabs.mypractice.collectionTest;

import java.util.Collections;
import java.util.HashSet;

import com.techlabs.mypractice.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet s=new HashSet();
		s.add("some");
		s.add("thing");
		s.add("some");
		s.add("repeat");
		s.add("string");
		
		//System.out.println(s);

		HashSet<Student> student=new HashSet<Student>();
		
		student.add(new Student(1,"Onkar","walavalkar",200));
		student.add(new Student(3,"rahul","shah",220));
		student.add(new Student(2,"raj","singh",210));
		student.add(new Student(4,"rahul","parab",206));
		student.add(new Student(1,"raj","parab",206));
		student.add(new Student(1,"Onkar","walavalkar",200));
		
		System.out.println(student);
		
	}

}
