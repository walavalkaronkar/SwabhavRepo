package com.techlabs.set;

import java.util.HashSet;

import com.techlabs.listitem.ListItem;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<ListItem> items=new HashSet<ListItem>();
		
		items.add(new ListItem(1,"mobile",1500,2));
		items.add(new ListItem(1,"mobile",1500,2));
		items.add(new ListItem(3,"charger",150,2));
		items.add(new ListItem(3,"charger",150,2));
		items.add(new ListItem(2,"use",15,2));
		//items.add("String");
		
		System.out.println(items.size());
		for(ListItem item:items)
		{
			System.out.println(item.totalPrice());
		}
	}
}
