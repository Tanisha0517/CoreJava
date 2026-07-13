package com.rays.oop.Overriding;

public class TestRbi {
	public static void main(String[] args) {
		
		
		System.out.println("==========RBI Bank=============");
		RbiBank r = new RbiBank();
		r.setInterestRate(10.1);
		r.setName("RBI Bank");
		
		System.out.println("Bank name : " +r.getName());
		r.interestRate();
		
		System.out.println("==========Axis Bank=============");
		AxisBank a = new AxisBank();

		a.setInterestRate(11.1);
		a.setName("Axis Bank");

		System.out.println("Bank name : " + a.getName());
		a.interestRate();

		
		System.out.println("==========HDFC Bank=============");
		HdfcBank h = new HdfcBank();
		h.setInterestRate(0);
		h.setName("HDFC Bank");

		System.out.println("Bank name : " + h.getName());
		h.interestRate();

		
		System.out.println("==========ICICI Bank=============");
		IciciBank i = new IciciBank();
		i.setInterestRate(9.8);
		i.setName("ICICI Bank");

		System.out.println("Bank name : " + i.getName());
		i.interestRate();
	}
}
