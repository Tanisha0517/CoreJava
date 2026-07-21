package com.rays.oop.constructor;

//a constructor can call another constructor 
public class Shape {

	public Shape() {
		System.out.println("This is Default Constructor");
	}

	public Shape(String color) {
		this();
		System.out.println("Single Parameterized constructor");
		 System.out.println("Color = " + color);

	}

	public Shape(String color, int borderWidth) {
		this(color);
		System.out.println("Double Parameterized Constructor");
		 System.out.println("Color = " + color);
		 System.out.println("BorderWidth = " + borderWidth);

	}

	public static void main(String[] args) {

//		Shape t1 = new Shape();

//		Shape s2 = new Shape("Red");
		
		Shape s3 = new Shape("Pink",5); 

	}

}
