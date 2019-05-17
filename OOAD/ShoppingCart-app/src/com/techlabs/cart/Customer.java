package com.techlabs.cart;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String id;
	private List<Order> order=new ArrayList<Order>();
	private static int autoincrement=1; 
	
	public Customer() {
		this.id="C"+autoincrement++;
	}
	
	public String getId() {
		return id;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void addOrder(Order order)
	{
		this.order.add(order);
	}
}
