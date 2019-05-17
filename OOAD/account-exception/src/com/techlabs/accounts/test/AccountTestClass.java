package com.techlabs.accounts.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.techlabs.accounts.Account;
import com.techlabs.accounts.CurrentAccount;
import com.techlabs.accounts.SavingAccount;

public class AccountTestClass {
	
	@Test
	public void CurrentAccountObjectCreationWithIdNameBalance()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new CurrentAccount(accountNumber,accountName);
		assertEquals(accountName, account.getAccountName());
		assertEquals(accountNumber, account.getAccountNumber());
		assertEquals(5000, (int)account.getBalance());
	}
	
	public void SavingAccountObjectCreationWithIdNameBalance()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new SavingAccount(accountNumber,accountName,3000);
		assertEquals(accountName, account.getAccountName());
		assertEquals(accountNumber, account.getAccountNumber());
		assertEquals(3000, (int)account.getBalance());
	}

	@Test
	public void CurrentAccountDepositBalanceAddesDesposit()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new CurrentAccount(accountNumber,accountName);
		int amount=1000;
		double balance=account.getBalance();
		account.deposit(amount);
		double newBalance=account.getBalance();
		assertEquals(6000, (int)newBalance);
	}
	
	@Test
	public void CurrentAccountDepositZeroBalanceGoestoDepositBalance()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new CurrentAccount(accountNumber,accountName);
		int amount=0;
		double balance=account.getBalance();
		account.deposit(amount);
		double newBalance=account.getBalance();
		assertEquals(5000, (int)newBalance);
	}
	
	@Test
	public void CurrentAccountDepositNegativeValuesReducesBalance()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new CurrentAccount(accountNumber,accountName);
		int amount=-1000;
		double balance=account.getBalance();
		account.deposit(amount);
		double newBalance=account.getBalance();
		assertEquals(4000, (int)newBalance);
	}
	
	@Test
	public void CurrentAccountWithdrawWithinLimit()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new CurrentAccount(accountNumber,accountName);
		double amount=4000;
		account.withdraw(amount);
		double balance=account.getBalance();
		assertEquals(1000,(int)balance);
	}
	
	@Test
	public void CurrentAccountEqualToWithinLimit()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new CurrentAccount(accountNumber,accountName);
		double amount=5000;
		account.withdraw(amount);
		double balance=account.getBalance();
		assertEquals(0,(int)balance);
	}
	
	@Test
	public void CurrentAccountWithdrawOverLimit()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new CurrentAccount(accountNumber,accountName);
		double amount=6000;
		account.withdraw(amount);
		double balance=account.getBalance();
		assertEquals(5000,(int)balance);
	}
	
	
	@Test
	public void SavingAccountWithdrawWithinLimit()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new SavingAccount(accountNumber,accountName,3000);
		double amount=2000;
		account.withdraw(amount);
		double balance=account.getBalance();
		assertEquals(1000,(int)balance);
	}
	
	@Test
	public void SavingAccountEqualToWithinLimit()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new SavingAccount(accountNumber,accountName,3000);
		double amount=2500;
		account.withdraw(amount);
		double balance=account.getBalance();
		assertEquals(500,(int)balance);
	}
	
	@Test
	public void SavingAccountWithdrawOverLimit()
	{
		Account account=null;
		String accountNumber="101";
		String accountName="Onkar";
		account =new SavingAccount(accountNumber,accountName,3000);
		double amount=3000;
		account.withdraw(amount);
		double balance=account.getBalance();
		assertEquals(3000,(int)balance);
	}
	
}
