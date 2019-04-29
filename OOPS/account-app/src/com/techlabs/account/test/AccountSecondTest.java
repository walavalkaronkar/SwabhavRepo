package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountSecondTest {

	public static void main(String[] args) {
		
		Account accountOne=new Account("101","Ram",1000);
		System.out.println("Number of Accounts are "+Account.countNoOfAccounts());
		
		Account accountTwo=new Account("102","Sham",14500);
		Account accountThree=new Account("103","Suraj",12000);
		
		System.out.println("Number of Accounts are "+Account.countNoOfAccounts());
	}

}
