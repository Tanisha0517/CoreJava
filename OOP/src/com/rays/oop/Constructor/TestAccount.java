package com.rays.oop.Constructor;

public class TestAccount {
	public static void main(String[] args) {

		Account a1 = new Account(1, "Saving", 1500);
		System.out.println("Account 1 Account Number : " + a1.getAccountNo());
		System.out.println("Account 1 Acoount Type : " + a1.getAccountType());
		System.out.println("Account 1 Balance : " + a1.getBalance());
		
		System.out.println("--------------------------------------");
		
		
		Account a2 = new Account(2, "Current", 15000);
		System.out.println("Account 2 Account Number : " + a2.getAccountNo());
		System.out.println("Account 2 Acoount Type : " + a2.getAccountType());
		System.out.println("Account 2 Balance : " + a2.getBalance());
		
		
	}
}
