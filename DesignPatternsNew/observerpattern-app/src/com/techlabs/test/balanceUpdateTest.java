package com.techlabs.test;

import com.techlabs.observer.EmailAlert;
import com.techlabs.observer.SmsAlert;
import com.techlabs.state.Account;

public class balanceUpdateTest {

	public static void main(String[] args) {
		Account account=new Account(101, "onkar", 1500);
		
		
		account.addAlertOption(new EmailAlert());
		account.addAlertOption(new SmsAlert());

		account.deposit(1500);
		account.withdraw(2000);
		account.withdraw(1500);
	}

}
