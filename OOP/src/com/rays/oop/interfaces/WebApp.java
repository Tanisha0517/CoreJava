package com.rays.oop.interfaces;

public class WebApp extends Ecomm implements Light, Dark {

	@Override
	public void darktheme() {
		System.out.println("Switched to Dark");

	}

	@Override
	public void lighttheme() {
		System.out.println("Switched to Light");

	}

}
