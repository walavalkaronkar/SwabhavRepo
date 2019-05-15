package com.techlabs.accounts.test;

import com.techlabs.accounts.Account;
import com.techlabs.accounts.CurrentAccount;
import com.techlabs.accounts.SavingAccount;
import com.techlabs.exception.InSufficientFundException;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc1=new SavingAccount("01", "Onkar", 1800);
		Account acc2=new CurrentAccount("02", "Ram");
		
		try
		{
			acc1.withdraw(6000);
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
				
	}
	public static void printDetails(Account account)
	{
		System.out.println(account.getAccountNumber()+" "+account.getAccountName()+" "+account.getBalance());
	}
}
