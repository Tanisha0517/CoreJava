package com.rays.oop.polymorphism;

public class TestRealShape {

	public static void main(String[] args) {
//		Rectangle r = new Rectangle();
		
		RealShape s = new RealRectangle();
		RealRectangle r = (RealRectangle) s;
		
		r.setLength(10);
		r.setWidth(20);
		
		s.execute();
//		-----------------------------------------------------
		RealShape rs = new RealCircle();
		RealCircle c = (RealCircle) rs;
		
		c.setRadius(2);
		
		rs.execute();
//		-----------------------------------------------------
		RealShape ts = new RealTriangle();
		RealTriangle t = (RealTriangle) ts;
		
		t.setBase(3);
		t.setHeight(5);
		
		ts.execute();
		
		
		
	}
}
