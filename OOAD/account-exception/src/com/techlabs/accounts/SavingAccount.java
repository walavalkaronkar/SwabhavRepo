package com.techlabs.accounts;

public class SavingAccount extends Account {

	private static final int MINIMUM_BALANCE=500;
	public SavingAccount(String accountNumber,String accountName,double balance)
	{
		super(accountNumber,accountName,balance);
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(balance-amount>= MINIMUM_BALANCE)
		{
			balance=balance-amount;
			System.out.println("Withdraw success of amount"+amount);
		}
		else
		{
			System.out.println("Insufficeint Balance");
		}
	}
}
