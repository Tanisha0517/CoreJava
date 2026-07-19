package com.rays.oop.abstraction;

public class TestShape {
	public static void main(String[] args) {
		System.out.println("=====Circle====");
		Circle c = new Circle();
		c.setRadius(3.14);

		System.out.println("Radius Circle : " + c.getRadius());
		c.area();

		System.out.println("");
		System.out.println("=====Rectangle====");
		Rectangle r = new Rectangle();
		r.setLength(2);
		r.setWidth(5);
		System.out.println("Length : " + r.getLength());
		System.out.println("Width : " + r.getWidth());
		r.area();

		System.out.println("");
		System.out.println("=====Triangle====");
		Triangle t = new Triangle();
		t.setBase(5);
		t.setHeight(10);
		System.out.println("Base : " + t.getBase());
		System.out.println("Height : " + t.getHeight());
		t.area();

	}
}
