package com.rays.oop.Polymorphism;

public class TestBankByReturnType {

	public static void main(String[] args) {

		Bank[] b = new Bank[3];

		b[0] = Bank.getBank(1);
		b[1] = Bank.getBank(2);
		b[2] = Bank.getBank(3);

		printBank(b);
	}

	public static void printBank(Bank[] b) {

		for (Bank bank : b) {

			System.out.println("Bank Name : " + bank.getName());
			System.out.println("Interest Rate : " + bank.interestRate());
			System.out.println();
		}
	}
}
