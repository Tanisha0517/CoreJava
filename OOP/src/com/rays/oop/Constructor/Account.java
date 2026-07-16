package com.rays.oop.Constructor;

public class Account {
	int AccountNo;
	String AccountType;// saving account, current account
	int Balance;

	public Account(int AccountNo, String AccountType, int Balance) {
		this.AccountNo = AccountNo;
		this.AccountType = AccountType;
		this.Balance = Balance;
	}

	public int getAccountNo() {
		return AccountNo;
	}

	public String getAccountType() {
		return AccountType;
	}

	public int getBalance() {
		return Balance;
	}

}
