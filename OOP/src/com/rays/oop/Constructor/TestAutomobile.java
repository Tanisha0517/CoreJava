package com.rays.oop.constructor;

public class TestAutomobile {

	public static void main(String[] args) {

		Automobile a1 = new Automobile("Pink", 100, "TATA");
		System.out.println("A1 Color : " + a1.getColor());
		System.out.println("A1 Speed : " + a1.getSpeed());
		System.out.println("A1 Make : " + a1.getMake());

		System.out.println("-----------------------------");

		Automobile a2 = new Automobile("Red", 100, "Toyota");
		System.out.println("A2 Color : " + a2.getColor());
		System.out.println("A2 Speed : " + a2.getSpeed());
		System.out.println("A2 Make : " + a2.getMake());

		System.out.println("-----------------------------");

		Automobile a3 = new Automobile("Black", 130, "Honda");
		System.out.println("A3 Color : " + a3.getColor());
		System.out.println("A3 Speed : " + a3.getSpeed());
		System.out.println("A3 Make : " + a3.getMake());
	}
}
