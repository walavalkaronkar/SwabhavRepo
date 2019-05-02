package com.swbhavtechlabs.myexception;

public class NotEvenException extends RuntimeException {
	public NotEvenException() {
		super("Number is not even number");
	}
}
