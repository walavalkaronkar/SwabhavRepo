package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account accountOne=new Account("101","Ram",1000);
		Account accountTwo=new Account("102","Sham",14500);
		Account accountThree=new Account("103","Suraj",12000);
		Account accountFour=new Account("104","Raj",9000);
		
		//accountOne.deposit(800);
		displayAccountDetails(accountOne);
		accountOne.withdraw(500);
		displayAccountDetails(accountOne);
		
		Account account[]=new Account[4];
		account[0]=accountOne;
		account[1]=accountTwo;
		account[2]=accountThree;
		account[3]=accountFour;
		
		findRichest(account);
		
	}
	
	public static void  displayAccountDetails(Account account)
	{
		System.out.println(account.getAccno()+" "+account.getName()+" "+account.getBalance());
	}
	
	
	public static void findRichest(Account[] account)
	{
		double balance=500;
		String name="";
		
		for(Account acc:account)
		{
			if(acc.getBalance()>balance)
			{
				balance=acc.getBalance();
				name=acc.getName();
			}
		}
		System.out.println("Richest account is:"+name);
	}
}
