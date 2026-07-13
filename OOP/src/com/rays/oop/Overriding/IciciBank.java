package com.rays.oop.Overriding;

public class IciciBank extends RbiBank {
	@Override
	public void interestRate() {
		System.out.println("Interest rate of icici bank : " + interestRate);
	}

}
