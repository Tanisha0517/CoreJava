package com.rays.oop.Polymorphism;

public class Circle extends Shape {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public void area() { // rewrite
		System.out.println("Area of circle : " + (Math.PI * radius * radius));
	}
}
