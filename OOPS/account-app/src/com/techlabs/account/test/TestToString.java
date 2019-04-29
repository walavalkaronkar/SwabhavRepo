package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestToString {

	public static void main(String[] args) {
		
		Account account=new Account("101","Ram",12000);
		System.out.println(account);
		System.out.println(account.toString());
		
	}

}
