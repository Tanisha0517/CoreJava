package com.rays.oop.Polymorphism;

public class Bank {

	public double interestRate() {
		return 11.0;
	}

	public String getName() {
		return "RBI";
	}

	public static Bank getBank(int i) {
		if (i == 1) {
			return new AxisBank();
		}

		if (i == 2) {
			return new HDFCBank();
		}

		if (i == 3) {
			return new ICICIBank();
		}

		return null;

	}

}
