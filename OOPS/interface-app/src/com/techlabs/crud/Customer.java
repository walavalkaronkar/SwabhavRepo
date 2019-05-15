package com.techlabs.crud;

public class Customer implements ICrudable {

	@Override
	public void create() {
		System.out.println("created customer");
		
	}

	@Override
	public void read() {
		System.out.println("Read customer");
		
	}

	@Override
	public void update() {
		System.out.println("update customer");
		
	}

	@Override
	public void delete() {
		System.out.println("deleted customer");
		
	}

	
}
