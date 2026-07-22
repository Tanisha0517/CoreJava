package com.rays.custom;

public class InsufficientFundException extends RuntimeException { // Run time

	public InsufficientFundException() {
		super("Insufficient fund transfer");
	}

}
