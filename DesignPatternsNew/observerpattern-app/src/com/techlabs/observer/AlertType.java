package com.techlabs.observer;

import com.techlabs.state.Account;

public interface AlertType {
	
	public void updateBalance(Account account,String message);

}
