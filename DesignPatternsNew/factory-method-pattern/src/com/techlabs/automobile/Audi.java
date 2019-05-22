package com.techlabs.automobile;

class Audi implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Audi starts");
	}

	@Override
	public void stop() {
		System.out.println("Audi stops");
		
	}
}
