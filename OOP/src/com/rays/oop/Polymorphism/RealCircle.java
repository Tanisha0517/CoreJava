package com.rays.oop.polymorphism;

public class RealCircle extends RealShape {
	private int radius = 2;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public boolean validate() {
		if (this.radius > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void area() {
		int circleArea = (int) (Math.PI * radius * radius);
		System.out.println("Circle Area = " + circleArea);
	}
}
