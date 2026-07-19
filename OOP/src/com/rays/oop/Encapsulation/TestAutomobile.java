package com.rays.oop.encapsulation;

public class TestAutomobile {

	public static void main(String[] args) {
		Automobile a = new Automobile();

		a.setColor("Pink");
		System.out.println("Color : " + a.getColor());

		a.setMake("BMW");
		System.out.println("Make : " + a.getMake());

		a.setSpeed(80);
		System.out.println("Speed : " + a.getSpeed());

	}
}
