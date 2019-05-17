package com.techlabs.cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private String id;
	private String date;
	private List<LineItem> items=new ArrayList<LineItem>();
	private static int autoincrement=1;
	
	Order()
	{
		Date date=new Date();
		this.id="O"+autoincrement++;
		this.date=""+date.getDate()+"/"+date.getMonth()+"/"+date.getYear();
	}

	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public List<LineItem> getItems() {
		return items;
	}
	
	public void addItem(LineItem listItem)
	{
		items.add(listItem);
	}
	
	public double totalCostOfOrder(List<LineItem> items)
	{
		double price=0;
		for(LineItem item:items)
		{
			price=price+item.getTotalCostOfProducts();
		}
		return price;
	}
}
