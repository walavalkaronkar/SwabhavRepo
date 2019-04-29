package com.techlabs.account.test;

import com.techlabs.account.Account;

public class TestEquality {

	public static void main(String[] args) {
		
		Account acc1=new Account("101","ABC",5000);
		Account acc2=new Account("101","ABC",5000);
		
		System.out.println(acc1==acc2);
		System.out.println(acc1==acc1);
		
		System.out.println(acc1.equals(acc2));
		System.out.println(acc1.equals(acc1));

	}

}
