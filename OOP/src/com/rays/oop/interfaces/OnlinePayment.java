package com.rays.oop.interfaces;

public class OnlinePayment extends Payment implements UPI, CreditCard, PayPal {

	@Override
	public void payPalPayment() {
		System.out.println("Payment done using PayPal");

	}

	@Override
	public void creditCardPayment() {
		System.out.println("Payment done using Credit Card");

	}

	@Override
	public void upiPayment() {
		System.out.println("Payment done using UPI");

	}

}
