package com.techlabs.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.techlabs.guitar.Instrument;
import com.techlabs.guitar.InstrumentSpec;
import com.techlabs.guitar.enums.Builder;
import com.techlabs.guitar.enums.InstrumentType;
import com.techlabs.guitar.enums.Type;
import com.techlabs.guitar.enums.Wood;
import com.techlabs.inventory.Inventory;

public class FindInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory=new Inventory();
		initialiseInventory(inventory);
		
		Map properties=new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOSTIC);
		properties.put("numberString", 6);
		properties.put("topWood", Wood.ALDER);
		properties.put("backWood",Wood.ALDER);
		
		InstrumentSpec clientSpec=new InstrumentSpec(properties);
		
		List matchingInstruments=inventory.search(clientSpec);
		if(!matchingInstruments.isEmpty())
		{
			System.out.println("You might Like this  instruments");
			for(Iterator i=matchingInstruments.iterator();i.hasNext();)
			{
				Instrument instrument=(Instrument) i.next();
				InstrumentSpec spec=instrument.getSpec();
				System.out.println("We have a"+spec.getProperty("instrumentType")+"with the following properties");
				for(Iterator j=spec.getProperties().keySet().iterator();j.hasNext();)
				{
					String propertyName=(String)j.next();
					if(propertyName.equals("instrumentType"))
						continue;
					System.out.println("   "+propertyName+":"+spec.getProperty(propertyName));
				}
				System.out.println("You can have this at"+spec.getProperty("instrumentType")+" for Rs"+instrument.getPrice());
				
			}
		}
		else
		{
			System.out.println("Sooy we have nothing for you");
		}
		
		
	}

	public static void initialiseInventory(Inventory inventory)
	{
		Map properties=new HashMap();
		properties.put("instrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "CJ");
		properties.put("type", Type.ACOSTIC);
		properties.put("numberString", 6);
		properties.put("topWood", Wood.ALDER);
		properties.put("backWood",Wood.ALDER);
		inventory.addGuitar("1", 1200, new InstrumentSpec(properties));
		
		properties.put("builder", Builder.MARTIN);
		properties.put("model", "D-18");
		properties.put("type", Type.ELECTRIC);
		properties.put("topWood", Wood.BRAZILIAN);
		properties.put("backWood",Wood.BRAZILIAN);
		inventory.addGuitar("2", 1400, new InstrumentSpec(properties));
		
		properties.put("builder", Builder.FENDER);
		properties.put("model", "C-41");
		properties.put("type", Type.ACOSTIC);
		properties.put("numberString", 8);
		properties.put("topWood", Wood.ALDER);
		properties.put("backWood",Wood.ALDER);
		inventory.addGuitar("3", 1500, new InstrumentSpec(properties));
		inventory.addGuitar("4", 1600, new InstrumentSpec(properties));
	}
}
