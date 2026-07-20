package com.rays.oop.polymorphism;

public class RealShape {
	public void execute() {
		if (validate()) {
			area();
		} else {
			System.out.println("Invalid Parameters");
		}
	}

	public boolean validate() {
		return false;
	}

	public void area() {
		System.out.println("Shape area method");
	}
}
