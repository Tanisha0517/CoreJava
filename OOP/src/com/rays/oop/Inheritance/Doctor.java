package com.rays.oop.Inheritance;

public class Doctor extends Person {

	protected String registrationNo;

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getRegistration() {
		return registrationNo;
	}
}
