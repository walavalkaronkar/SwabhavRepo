package com.techlabs.state;

import java.util.List;
import java.util.ArrayList;

import com.techlabs.observer.AlertType;

public class Account implements State {

	private int accountNumber;
	private String name;
	private double balance;
	List<AlertType> alertlist=new ArrayList<AlertType>();
	
	public Account(int accountNumber,String name,double balance)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}
		
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount)
	{
		balance=balance+amount;
		String message="Amount Deposited";
		update(message);
	}
	
	public void withdraw(double amount)
	{
		if(balance-amount >= 500 && amount > 0)
		{
			balance=balance-amount;
			String message="Amount withdrawn";
			update(message);
		}
	}

	@Override
	public void addAlertOption(AlertType alert) {
		alertlist.add(alert);

		
	}

	@Override
	public void deleteAlertOption(AlertType alert) {
		alertlist.remove(alert);
	}
	
	@Override
	public void update(String message)
	{
		for(AlertType alert: alertlist)
		{
			alert.updateBalance(this,message);
		}
	}
}
