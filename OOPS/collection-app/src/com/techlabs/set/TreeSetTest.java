package com.techlabs.set;

import java.util.Collections;
import java.util.TreeSet;

import com.techlabs.listitem.ListItem;
import com.techlabs.listitem.NameComparator;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<ListItem> items=new TreeSet<ListItem>(new NameComparator());
		items.add(new ListItem(1,"mobile",1500,2));
		items.add(new ListItem(3,"charger",150,2));
		items.add(new ListItem(3,"charger",150,2));
		items.add(new ListItem(1,"mobile",1500,2));
		items.add(new ListItem(2,"use",15,2));
		
		items.add(new ListItem(4,"charger",150,2));
		System.out.println(items.size());
		
		
		for(ListItem item:items)
		{
			System.out.println(item.getId()+" "+item.getName()+" "+item.getPrice());
		}
	}
}
