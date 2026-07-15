package com.rays.oop.Polymorphism;

public class TestShapeByMethodArguments {
	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle();
		s[1] = new Rectangle();
		s[2] = new Triangle();

		Circle c = (Circle) s[0];
		c.setRadius(3);

		Rectangle r = (Rectangle) s[1];
		r.setLength(5);
		r.setWidth(4);

		Triangle t = (Triangle) s[2];
		t.setBase(6);
		t.setHeight(4);

		calculateArea(s);

	}

	static void calculateArea(Shape[] s) {
		for (int i = 0; i < s.length; i++) {
			s[i].area();
		}

	}

}
