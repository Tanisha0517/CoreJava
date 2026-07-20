package com.rays.oop.polymorphism;

public class RealRectangle extends RealShape {

	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean validate() {
		if (this.length > 0 && this.width > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void area() {
		int rectangleArea = this.length * this.width;
		System.out.println("Rectangle Area = " + rectangleArea);
	}

}
