package com.rays.oop.polymorphism;

public class RealTriangle extends RealShape {
	private int base;
	private int height;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean validate() {
		if (this.base > 0 && this.height > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void area() {
		int triangleArea = this.base * this.height;
		System.out.println("Triangle Area = " + triangleArea);
	}

}
