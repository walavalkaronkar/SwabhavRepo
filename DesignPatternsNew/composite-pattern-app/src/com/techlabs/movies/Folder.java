package com.techlabs.movies;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Istorage {

	private String name;
	private int level;
	private List<Istorage> items=new ArrayList<Istorage>();
	
	public Folder(String name) {
		this.name=name;
	}
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int level)
	{
		this.level=level;
	}
	
	public void addItems(Istorage item)
	{
		items.add(item);
	}
	
	
	@Override
	public void display() {
		for(int i=0;i<level;i++)
			System.out.print("  ");
		System.out.println(""+name);
		
		for(Istorage item:items)
		{
			for(int i=0;i<level;i++)
				System.out.print("  ");
			item.display();
		}
	}

}
