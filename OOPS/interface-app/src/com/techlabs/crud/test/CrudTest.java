package com.techlabs.crud.test;

import com.techlabs.crud.Customer;
import com.techlabs.crud.ICrudable;

public class CrudTest {

	public static void main(String[] args) {
		
		DBOperation(new Customer());

	}

	static void DBOperation(ICrudable crud)
	{
		crud.create();
		crud.delete();
		crud.read();
		crud.update();
	}
}
