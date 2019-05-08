package com.techlabs.serialise.test;

import java.io.IOException;

import com.techlabs.account.Account;
import com.techlabs.serialise.DeserializeAccount;
import com.techlabs.serialise.SerializeAccount;

public class TestSerilizationAndDeserization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String account="Account.ser";
		
		//Account acc=new Account("1","Onkar",1200);
		//System.out.println("Before Serialisation"+acc);
		//SerializeAccount.serialize(acc, account);
		
		
		 Account acc=null;
		
		acc=DeserializeAccount.deserialize(account);
		System.out.println("After Serialisation "+acc);
		

	}

}
