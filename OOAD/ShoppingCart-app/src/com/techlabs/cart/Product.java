package com.techlabs.cart;

public class Product {

	private String id;
	private String name;
	private float discount;
	private double cost;
	private static int autoincrement=1;
	
	public Product(String name,float discount,double cost)
	{
		this.id="P"+autoincrement++;
		this.name=name;
		this.discount=discount;
		this.cost=cost;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getDiscount() {
		return discount;
	}

	public double getCost() {
		return cost;
	}
	
	
	public double costAfterDiscount()
	{
		double price;
		price=cost-cost*discount/100;
		return price;
	}
}
