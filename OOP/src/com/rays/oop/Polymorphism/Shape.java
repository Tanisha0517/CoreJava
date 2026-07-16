package com.rays.oop.Polymorphism;

public class Shape {
	
	public void area() {
		System.out.println("Area : ");
	}
	
	public static Shape getShape(int i) {

        if (i == 1) {
            return new Rectangle();
        }

        if (i == 2) {
            return new Circle();
        }

        if (i == 3) {
            return new Triangle();
        }

        return null;
    }
}
