package com.techlabs.singleton.test;

import com.techlabs.singleton.DataService;

public class DataSeviceTest {

	public static void main(String[] args) {
		
		DataService sv1=DataService.getInstance();
		DataService sv2=DataService.getInstance();
		System.out.println(sv1.hashCode());
		System.out.println(sv2.hashCode());

	}

}
