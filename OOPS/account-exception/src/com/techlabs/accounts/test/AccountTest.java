package com.techlabs.accounts.test;

import com.techlabs.accounts.Account;
import com.techlabs.accounts.CurrentAccount;
import com.techlabs.accounts.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc1=new SavingAccount("01", "Onkar", 1800);
		Account acc2=new CurrentAccount("02", "Ram");
		printDetails(acc1);
		printDetails(acc2);
		
		acc1.deposit(15000);
		acc1.withdraw(12000);
		printDetails(acc1);
		acc2.withdraw(5000);
		printDetails(acc2);
		
	}
	public static void printDetails(Account account)
	{
		System.out.println(account.getAccountNumber()+" "+account.getAccountName()+" "+account.getBalance());
	}
}
