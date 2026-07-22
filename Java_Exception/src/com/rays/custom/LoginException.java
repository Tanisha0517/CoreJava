package com.rays.custom;

public class LoginException extends Exception{ //Compile Time

	public LoginException() {
		super("Invalid Credentials!");
	}
}
