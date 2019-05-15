package com.techlabs.inventory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.guitar.Guitar;
import com.techlabs.guitar.Instrument;
import com.techlabs.guitar.InstrumentSpec;
import com.techlabs.guitar.enums.Builder;
import com.techlabs.guitar.enums.Type;
import com.techlabs.guitar.enums.Wood;

public class Inventory {

	private List inventory;
	
	public Inventory()
	{
		inventory=new LinkedList();
	}
	
	public void addGuitar(String serialNumber,double price,InstrumentSpec spec)
	{
		Instrument instrument=new Instrument(serialNumber,price,spec);
		inventory.add(instrument);
		
	}
	
	public List search(InstrumentSpec searchSpec)
	{
		List list=new LinkedList();
		for(Iterator i=inventory.iterator();i.hasNext();)
		{
			Instrument instrument=(Instrument)i.next();
			InstrumentSpec spec=instrument.getSpec();
			if(searchSpec.getProperty("instrumentType")!=null  &&  (!spec.getProperty("instrumentType").equals(searchSpec.getProperty("instrumentType"))))
				continue;

			if(searchSpec.getProperty("builder")!=null &&(!spec.getProperty("builder").equals(searchSpec.getProperty("builder"))))
				continue;
			
			if(searchSpec.getProperty("model")!=null  && (!spec.getProperty("model").equals(searchSpec.getProperty("model"))))
				continue;

			if(searchSpec.getProperty("type")!=null && (!spec.getProperty("type").equals(searchSpec.getProperty("type"))))
				continue;
			
			if(searchSpec.getProperty("numberString")!=null && (!spec.getProperty("numberString").equals(searchSpec.getProperty("numberString"))))
				continue;
			
			if(searchSpec.getProperty("topWood")!=null && (!spec.getProperty("topWood").equals(searchSpec.getProperty("topWood"))))
				continue;
			
			if(searchSpec.getProperty("backWood")!=null && (!spec.getProperty("backWood").equals(searchSpec.getProperty("backWood"))))
				continue;
			list.add(instrument);
		}
		return list;
	}
}
