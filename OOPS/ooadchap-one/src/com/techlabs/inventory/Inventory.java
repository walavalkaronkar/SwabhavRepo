package com.techlabs.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.enums.Builder;
import com.techlabs.guitar.enums.Type;
import com.techlabs.guitar.enums.Wood;

public class Inventory {

	private List guitars;
	
	public Inventory()
	{
		guitars=new LinkedList();
	}
	
	public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backwood, Wood topwood,double price)
	{
		Guitar guitar=new Guitar(serialNumber,builder,model,type,backwood,topwood,price);
		guitars.add(guitar);
		
	}
	
	public Guitar search(Guitar searchGuitar)
	{
		for(Iterator i=guitars.iterator();i.hasNext();)
		{
			Guitar guitar=(Guitar)i.next();
			if(searchGuitar.getBuilder()!=guitar.getBuilder())
				continue;
			String model=searchGuitar.getModel().toLowerCase();
			if( (model!=null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())))
					continue;
			if(searchGuitar.getType()!=guitar.getType())
				continue;
			if(searchGuitar.getBackwood()!=guitar.getBackwood())
				continue;
			if(searchGuitar.getTopwood()!=guitar.getTopwood())
				continue;
			System.out.println(guitar);
		}
		return null;
	}
}
