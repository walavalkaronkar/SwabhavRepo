package com.techlabs.automobile;

class BMW implements IAutoMobile{

	@Override
	public void start() {
		System.out.println("BMW starts");
	}

	@Override
	public void stop() {
		System.out.println("BMW stops");
		
	}

}
