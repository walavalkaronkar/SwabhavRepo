package com.techlabs.cart;

import java.util.List;

public class ShoppingCartTest {

	public static void main(String[] args) {
		
		Customer customer1=new Customer();
		Product product1=new Product("Samsung Mobile", 12.5f,20000);
		Product product2=new Product("Redmi Mobile", 2.5f,12000);
		Product product3=new Product("RealMe Mobile", 10.0f,10000);
		Product product4=new Product("Oppo Mobile", 5.0f,15000);
		Product product5=new Product("vivo Mobile", 12.5f,17000);
		
		LineItem lineItem1=new LineItem(2, product1);
		LineItem lineItem2=new LineItem(1, product2);
		LineItem lineItem3=new LineItem(3, product3);
		LineItem lineItem4=new LineItem(2, product4);
		LineItem lineItem5=new LineItem(4, product5);
		
		LineItem lineItem6=new LineItem(4, product1);
		
		Order order1=new Order();
		order1.addItem(lineItem1);
		order1.addItem(lineItem6);
		//order1.addItem(lineItem2);
		
		/*
		Order order2=new Order();
		order2.addItem(lineItem3);
		order2.addItem(lineItem4);
		order2.addItem(lineItem5);
		
		
		customer1.addOrder(order2);
		*/
		customer1.addOrder(order1);
		
		System.out.println("Customer Id :"+customer1.getId());
		List<Order>order=customer1.getOrder();
		
		for(Order o:order)
		{
			System.out.println("Order id: "+o.getId()+" Date: "+o.getDate());
			List<LineItem> items=o.getItems();
			
			for(LineItem item:items)
			{
				System.out.println("LineItem id: "+item.getId());
				Product prod=item.getProduct();
				System.out.println(prod.getId()+" Name: "+prod.getName()+" Cost: "+prod.getCost()+" Discount:"+prod.getDiscount());
				System.out.println("Cost of each after Discount :"+prod.costAfterDiscount());
				System.out.println("Quantity:"+item.getQuantity());
				System.out.println("Total Cost of "+item.getQuantity()+" is : "+item.getTotalCostOfProducts());
			}
			
			System.out.println("total cost of order :"+o.totalCostOfOrder(items));
			System.out.println();
		}
		
		
	}
}
