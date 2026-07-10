package com.rays.oop.Inheritance;

import java.util.Date;

public class Person {

	protected String name;
	protected String address;
	protected Date dateOfBirth;

	// setter method
	public void setname(String name) {
		this.name = name;
	}

	// getter method
	public String getname() {
		return name;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getaddress() {
		return address;
	}

	public void setDate(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
public Date getDate() {
		
		return dateOfBirth;
	}

}
