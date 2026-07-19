package com.rays.oop.abstraction;

public class Rectangle extends Shape {

	private int length;
	private int Width;

	@Override
	public void area() {
		System.out.println("Area of rectaangle " + (length * Width));

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int Width) {
		this.Width = Width;
	}

	
}
