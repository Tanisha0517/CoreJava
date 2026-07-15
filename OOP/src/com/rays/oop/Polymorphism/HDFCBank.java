package com.rays.oop.Polymorphism;

public class HDFCBank extends Bank {

	@Override
	public double interestRate() {
		return 10.10;
	}
	
	@Override
	public String getName() {
		return "HDFC Bank";
	}
}
