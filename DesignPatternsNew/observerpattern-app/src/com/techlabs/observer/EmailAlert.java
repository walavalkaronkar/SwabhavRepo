package com.techlabs.observer;

import com.techlabs.state.Account;

public class EmailAlert implements AlertType{

	@Override
	public void updateBalance(Account account,String message) {
		System.out.println("Email Balance Upate alert");
		System.out.println(message);
		System.out.println("Account number"+account.getAccountNumber()+" Name :"+account.getName());
		System.out.println("Balance is"+account.getBalance());
		System.out.println();
		
	}
}
