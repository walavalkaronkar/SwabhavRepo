package com.techlabs.student;

import java.util.Comparator;

import com.techlabs.listitem.ListItem;

public class SandardComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Student student1=(Student)obj1;
		Student student2=(Student)obj2;
		return student1.getStd()-student2.getStd();
	}
	
}
