package com.rays.oop.abstraction;

public class HDFCBank extends Bank {

	private String name;
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void interestRate() {
		System.out.println("Interest rate of HDFC Bank : ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
