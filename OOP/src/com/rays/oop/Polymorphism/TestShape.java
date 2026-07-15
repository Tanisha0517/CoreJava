package com.rays.oop.Polymorphism;

public class TestShape {

	public static void main(String[] args) {

		// Parent reference creates Circle object
		Shape s1 = new Circle();

		// Convert parent reference into Circle reference
		Circle c = (Circle) s1;

		// Set Circle radius
		c.setRadius(3.14);

		// Calculate Circle area
		c.area();

		// Parent reference creates Rectangle object
		Shape s2 = new Rectangle();

		// Convert parent reference into Rectangle reference
		Rectangle r = (Rectangle) s2;

		// Set Rectangle length and width
		r.setLength(5);
		r.setWidth(5);

		// Calculate Rectangle area
		r.area();

		// Parent reference creates Triangle object
		Shape s3 = new Triangle();

		// Convert parent reference into Triangle reference
		Triangle t = (Triangle) s3;

		// Set Triangle base and height
		t.setBase(4);
		t.setHeight(4);

		// Calculate Triangle area
		t.area();
	}
}