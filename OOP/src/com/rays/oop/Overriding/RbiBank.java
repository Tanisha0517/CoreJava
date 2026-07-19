package com.rays.oop.overriding;

public class RbiBank {

	protected double interestRate;
	protected String name;

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

	public void interestRate() {
		System.out.println("Interest of RBI : " + interestRate);
	}

}
