package com.techlabs.automobile.test;

import com.techlabs.automobile.AutoMobileFactory;
import com.techlabs.automobile.AutoType;
import com.techlabs.automobile.IAutoMobile;

public class AutoMobileTest {

	public static void main(String[] args) {
		
		AutoMobileFactory autoMobileFactory=new AutoMobileFactory();
		IAutoMobile automobile=autoMobileFactory.make(AutoType.AUDI);
		automobile.start();
		automobile.stop();
		System.out.println(automobile);

	}

}
