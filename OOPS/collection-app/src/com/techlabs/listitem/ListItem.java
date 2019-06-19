package com.techlabs.listitem;

import java.util.Comparator;

public class ListItem implements Comparable {

	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public ListItem(int id,String name,double price, int quantity)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalPrice()
	{
		double cost=price*quantity;
		return cost;
	}

	@Override
	public int compareTo(Object obj) {
		ListItem list=(ListItem) obj;
		return list.id-id;
	}

	@Override
	public String toString() {
		return "ListItem [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		ListItem other = (ListItem) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
