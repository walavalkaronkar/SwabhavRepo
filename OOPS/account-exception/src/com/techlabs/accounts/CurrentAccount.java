package com.techlabs.accounts;

public class CurrentAccount extends Account {

	private static final int MINIMUM=0;
	public CurrentAccount(String accountNumber,String accountName)
	{
		super(accountNumber,accountName,5000);
	}

	@Override
	public void withdraw(double amount) {
		if(balance-amount>=MINIMUM)
		{
			balance=balance-amount;
			System.out.println("Withdraw Sucess");
		}
		else
		{
			System.out.println("Already Reached Limit");
		}
	}
}
