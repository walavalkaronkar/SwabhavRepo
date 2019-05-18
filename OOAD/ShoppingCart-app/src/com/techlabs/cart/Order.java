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
	
	public void addItem(LineItem lineItem)
	{
		String productId=lineItem.getProduct().getId();
		if(items.size()==0)
		{
			items.add(lineItem);
		}
		else
		{
			for(LineItem item:items)
			{
				if(productId.equals(item.getProduct().getId()))
				{
					int quantity=item.getQuantity()+lineItem.getQuantity();
					item.setQuantity(quantity);
				}
				else
				{
					items.add(lineItem);
				}	
			}
		}
		
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
