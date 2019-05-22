package com.techlabs.automobile;

class Tesla implements IAutoMobile{

	@Override
	public void start() {
		System.out.println("Tesla starts");
	}

	@Override
	public void stop() {
		System.out.println("Tesla stops");
		
	}
}
