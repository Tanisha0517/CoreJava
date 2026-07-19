package com.rays.oop.overriding;

public class HdfcBank extends RbiBank {
	@Override
	public void interestRate() {
System.out.println("Interest rate of hdfc bank : " + interestRate);
	}
}
