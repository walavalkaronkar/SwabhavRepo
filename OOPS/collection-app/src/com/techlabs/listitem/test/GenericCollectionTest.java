package com.techlabs.listitem.test;

import java.util.ArrayList;

import com.techlabs.listitem.ListItem;

public class GenericCollectionTest {

	public static void main(String[] args) {
		
		ArrayList<ListItem> items=new ArrayList<ListItem>();
		items.add(new ListItem(1,"mobile",1500,2));
		items.add(new ListItem(2,"charger",350,1));
		items.add(new ListItem(3,"Usb cable",200,2));
		//items.add("String");
		
		for(ListItem item:items)
		{
			System.out.println(item);
		}
	}

}
