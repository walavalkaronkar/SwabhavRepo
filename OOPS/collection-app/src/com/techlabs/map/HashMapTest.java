package com.techlabs.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.techlabs.student.Student;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Student,Student> map=new HashMap<Student,Student>();
		
		Student s1=new Student(1,12,"onkar");
		Student s2=new Student(1,12,"rahul");
		Student s3=new Student(2,10,"raju");
		Student s4=new Student(2,11,"ram");
		
		map.put(s1, s1);
		map.put(s2, s2);
		map.put(s3, s3);
		map.put(s4, s4);
		
		Set set = map.entrySet();
	    Iterator iterator = set.iterator();
	    while(iterator.hasNext()) 
	    {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         //System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         Student s= (Student)mentry.getValue();
	         System.out.println(s.getId()+" "+s.getStd()+" "+s.getName());
	    }
		

	}

}
