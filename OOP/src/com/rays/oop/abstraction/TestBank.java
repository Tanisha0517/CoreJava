package com.rays.oop.abstraction;

public class TestBank {
	public static void main(String[] args) {

		AxisBank a = new AxisBank();
		a.setName("Axis Bank");
		System.out.println(a.getName());
		a.setInterestRate(11.1);

		System.out.println("Interest Rate : " + a.getInterestRate());

		System.out.println(" ");

		HDFCBank h = new HDFCBank();
		h.setName("HDFC Bank");
		System.out.println(h.getName());
		h.setInterestRate(10.1);

		System.out.println("Interest Rate : " + h.getInterestRate());

		System.out.println(" ");

		ICICIBank i = new ICICIBank();
		i.setName("ICICI Bank");
		System.out.println(i.getName());
		i.setInterestRate(11.0);

		System.out.println("Interest Rate : " +i.getInterestRate());

	}
}
