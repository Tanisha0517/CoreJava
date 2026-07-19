package com.rays.oop.abstraction;

public class ICICIBank extends Bank {

	private String name;
	private double interestRate;

	@Override
	public void interestRate() {
		System.out.println("Interest rate of ICICI Bank : ");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	

}
