package com.techlabs.set;

import java.util.LinkedHashSet;

import com.techlabs.listitem.ListItem;

public class LinkedSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<ListItem> items=new LinkedHashSet<ListItem>();
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
