package com.techlabs.singleton;

public class DataService {
	
	public static DataService container;
	private DataService()
	{}
	
	public static DataService getInstance()
	{
		if(container==null)
		{
			container=new DataService();
			return container;
		}
		return container;
	}
}
