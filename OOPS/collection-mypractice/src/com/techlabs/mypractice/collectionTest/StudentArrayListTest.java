package com.techlabs.mypractice.collectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.techlabs.mypractice.Student;

public class StudentArrayListTest {

	public static void main(String[] args) {
		
		
		ArrayList<Student> list=new ArrayList<Student>();
		
		list.add(new Student(1,"Onkar","walavalkar",200));
		list.add(new Student(3,"rahul","shah",220));
		list.add(new Student(2,"raj","singh",210));
		list.add(new Student(4,"rahul","parab",206));
		list.add(new Student(6,"sam","naidu",212));
		list.add(new Student(5,"sham","pandey",190));
		list.add(new Student(7,"Onkar","walavalkar",200));
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list,Student.SortByMarks);
		System.out.println(list);
		
		Collections.sort(list,new SortByLastName());
		System.out.println(list);
	}

}

class SortByLastName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getStudentLastName().compareTo(o2.getStudentLastName());
	}
	
}
