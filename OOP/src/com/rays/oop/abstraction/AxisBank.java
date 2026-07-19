package com.rays.oop.abstraction;

public class AxisBank extends Bank {

	private String name;
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void interestRate() {
		System.out.println("Interest rate of axis bank ");
		
	}

}
