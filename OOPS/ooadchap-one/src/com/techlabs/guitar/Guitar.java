package com.techlabs.guitar;

import com.techlabs.guitar.enums.Builder;
import com.techlabs.guitar.enums.Type;
import com.techlabs.guitar.enums.Wood;

public class Guitar {

	private String serialNumber,model;
	private double price;
	private Builder builder;
	private Type type;
	Wood backwood,topwood;
	public Guitar(String serialNumber, Builder builder, String model, Type type, Wood backwood, Wood topwood,double price) {
		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backwood = backwood;
		this.topwood = topwood;
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackwood() {
		return backwood;
	}
	public Wood getTopwood() {
		return topwood;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Guitar [serialNumber=" + serialNumber + ", model=" + model + ", price=" + price + ", builder=" + builder
				+ ", type=" + type + ", backwood=" + backwood + ", topwood=" + topwood + "]";
	}
	
	
}
