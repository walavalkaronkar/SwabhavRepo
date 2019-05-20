package com.techlabs.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {
	}
	
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if(instance==null)
		{
			instance=new ThreadSafeSingleton();
		}
		return instance;
	}
}

//it reduces the performance because of the cost associated with the synchronized method,
// although we need it only for the first few threads who might create the separate instances 