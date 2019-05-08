package com.techlabs.serialise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.account.Account;

public class DeserializeAccount {

	public static Account deserialize(String fileName) throws IOException,ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Account acc=(Account)obj;
		ois.close();
		return acc;
}
	
}
