package com.techlabs.singleton;

public class LazyinitilisationSingleton {

	public static LazyinitilisationSingleton instance;
	
	public LazyinitilisationSingleton()
	{
		
	}
	
	public static LazyinitilisationSingleton getInstance()
	{
		if(instance==null)
		{
			instance=new LazyinitilisationSingleton();
		}
		return instance;
	}
}
