package com.rays.oop.inheritance;

public class Doctor extends Person {

	protected String registrationNo;

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getRegistration() {
		return registrationNo;
	}
}
