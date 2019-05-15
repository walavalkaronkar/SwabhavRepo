package com.techlabs.accounts;

import com.techlabs.exception.InSufficientFundException;

public abstract class Account {

	private String accountNumber;
	private String accountName;
	protected double balance;
	
	public Account(String accountNumber,String accountName,double balance)
	{
		this.accountNumber=accountNumber;
		this.accountName=accountName;
		this.balance=balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance()
	{
		return balance;
	}
	
	
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Amount added ");
	}
	
	public abstract void withdraw(double amount);
}
