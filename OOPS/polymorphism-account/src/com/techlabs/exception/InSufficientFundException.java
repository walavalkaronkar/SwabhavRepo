package com.techlabs.exception;

import com.techlabs.accounts.Account;

public class InSufficientFundException extends RuntimeException {

	public InSufficientFundException(Account acc)
	{
		super("InSufficient balance in account number "+acc.getAccountNumber()+" with account name "+acc.getAccountName()+" and balance "+acc.getBalance());
	}
}
