package com.techlabs.cart;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class OrderUnitTest {

	@Test
	public void placeOrderForNewProduct()
	{
		Product product1;
		LineItem lineItem1;
		Order order=new Order();
		
		product1=new Product("Samsung Mobile", 12.5f,20000);
		lineItem1=new LineItem(2, product1);
		
		assertEquals(0,order.getItems().size());
		order.addItem(lineItem1);
		assertEquals(1,order.getItems().size());

	}
	
	@Test
	public void placeOrderForSameProductAddsToQuantity()
	{
		Product product1;
		LineItem lineItem1;
		LineItem lineItem2;
		Order order=new Order();
		
		product1=new Product("Samsung Mobile", 12.5f,20000);
		lineItem1=new LineItem(2, product1);
		lineItem2=new LineItem(4, product1);
		
		order.addItem(lineItem1);
		order.addItem(lineItem2);
		List<LineItem> items=order.getItems();
		for(LineItem item:items)
		{
			assertEquals(6,item.getQuantity());
		}
	}
}
