package com.techlabs.adapter;


import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements Iterable<T> 
{

	private LinkedList<T> q=new LinkedList<T>();
	
	public void enque(T item)
	{
		q.addLast(item);
	}
	
	public T deque()
	{
		T item;
		item=q.removeFirst();
		return item;
	}
	
	public int count()
	{
		return q.size();
	}

	@Override
	public Iterator<T> iterator() {
		
		return this.q.iterator();
	}
}
