package com.techlabs.account;

import java.io.Serializable;

public class Account implements Serializable{

	private final static long serialVersionUID =1000; 
	private String accno;
	private String name;
	private double balance;
	//private String lname;
	//private static int noOfAccounts;
	
	/*static
	{
		noOfAccounts=0;
		System.out.println("Static block");
	}*/

	
	public Account(String accno,String name,double balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		//noOfAccounts++;
		//System.out.println("Instance Block");
	}
	
	//Getters
	public String getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	//public double getBalance() {
	//	return balance;
	//}
	
	@Override
	public String toString() {
		return " "+accno+ " "+name+" "+balance+" ";
	}

	/*
	public static  int countNoOfAccounts()
	{
		return noOfAccounts;
	}
	public void deposit(double amount)
	{
		//balance=balance+amount;
		System.out.println("Amount Added");
	}
	
	public void withdraw(double amount)
	{
		if(amount <= balance-500)
		{
			balance=balance-amount;
			System.out.println("Amount Deducted");
		}
		else
		{
			System.out.println("Insufficent Balance");
		}
	}

	@Override
	public boolean equals(Object obj) {
		Account acc=(Account)obj;
		if(!(accno.equals(acc.accno)))
		{
			return false;
		}
		else if(!(name.equals(acc.name)))
		{
			return false;
		}
		//else if(balance!=acc.balance)
		//{
		//	return false;
		//}
		
		return true;
		
	}
	*/
	
}
