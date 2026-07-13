package com.rays.oop.Overriding;

public class Rectangle extends Shape {
	private int length;
	private int width;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void area() {
		System.out.println("Area of rectangle : " + (length * width));
	}
}
