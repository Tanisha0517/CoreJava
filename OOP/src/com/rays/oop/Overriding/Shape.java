package com.rays.oop.Overriding;

public class Shape {

	protected String color;
	protected int borderWidhth;
	protected double area;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidhth() {
		return borderWidhth;
	}

	public void setBorderWidhth(int borderWidhth) {
		this.borderWidhth = borderWidhth;
	}
	
	public void area() {
		System.out.println("Area of shape : ");
	}

}
