package com.techlabs.cart;

public class LineItem {

	private String id;
	private int quantity;
	private Product product;
	private static int autoincrement=1;

	
	LineItem(int quantity,Product product)
	{
		this.id="LI"+autoincrement++ ;
		this.quantity=quantity;
		this.product=product;
	}
		
	public String getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity= quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double getTotalCostOfProducts()
	{
		double price=product.costAfterDiscount()*quantity;
		return price;
	}
}
