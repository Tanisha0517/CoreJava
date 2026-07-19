package com.rays.oop.interfaces;

public class BusinessMan extends Person implements Richman, SocialWorker {

	private String name;
	private String address;

	public void donation() {
		System.out.println("Gives Donation");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void helpToOthers() {
		System.out.println("Help others");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Earns money");
		
	}

	@Override
	public void party() {
		System.out.println("Enjoys party");
		
	}
}
