package com.techlabs.adapter;

public class QueueAdapterTest {

	public static void main(String[] args) {
		
		QueueAdapter<Integer> list=new QueueAdapter<>();
		list.enque(10);
		list.enque(20);
		list.enque(30);
		System.out.println(list.count());
		list.deque();
		System.out.println(list.count());
		
		for(Integer q: list)
		{
			System.out.println(q);
		}

	}

}
