package com.rays.oop.interfaces;

public class TestPayment {

	public static void main(String[] args) {
		UPI u = new OnlinePayment();
		u.upiPayment();
		
		CreditCard c = new OnlinePayment();
		c.creditCardPayment();
		
		PayPal p = new OnlinePayment();
		p.payPalPayment();
	}
}
