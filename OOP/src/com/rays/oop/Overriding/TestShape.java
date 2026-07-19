package com.rays.oop.overriding;

public class TestShape {
	public static void main(String[] args) {
     
		System.out.println("=====Circle====");
		Circle c = new Circle();
		c.setRadius(3.14);
		c.setColor("Pink");
		System.out.println("Radius Circle : " +c.getRadius());
		c.area();
		System.out.println("Color Circle : " +c.getColor());
		c.setBorderWidhth(1);
		System.out.println("Border Width Circle : " +c.getBorderWidhth());
		
		
		
		
		System.out.println("");
		System.out.println("=====Rectangle====");
		Rectangle r = new Rectangle();
		r.setLength(2);
		r.setWidth(5);
		System.out.println("Length : " +r.getLength());
		System.out.println("Width : " +r.getWidth());
		r.area();
		r.setColor("Yellow");
		System.out.println("Color Rectangle : " +r.getColor());
		r.setBorderWidhth(2);
		System.out.println("Border Width Rectangle : " +r.getBorderWidhth());
		
		
		
		
		
		System.out.println("");
		System.out.println("=====Triangle====");
		Triangle t = new Triangle();
		t.setBase(5);
		t.setHeight(10);
		System.out.println("Base : " +t.getBase());
		System.out.println("Height : " +t.getHeight());
		t.area();
		t.setColor("Black");
		System.out.println("Color Triangle : " +t.getColor());
		t.setBorderWidhth(3);
		System.out.println("Border Width Triangle : " +t.getBorderWidhth());
		
		
		
		
	}
}
