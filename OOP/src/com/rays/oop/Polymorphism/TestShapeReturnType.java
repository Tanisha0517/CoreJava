package com.rays.oop.Polymorphism;

public class TestShapeReturnType {

    public static void main(String[] args) {

        Shape[] s = new Shape[3];

        s[0] = Shape.getShape(1); // Rectangle
        s[1] = Shape.getShape(2); // Circle
        s[2] = Shape.getShape(3); // Triangle

        // Rectangle
        Rectangle r = (Rectangle) s[0];
        r.setLength(10);
        r.setWidth(5);

        // Circle
        Circle c = (Circle) s[1];
        c.setRadius(7);

        // Triangle
        Triangle t = (Triangle) s[2];
        t.setBase(10);
        t.setHeight(8);

        calculateArea(s);
    }

    static void calculateArea(Shape[] s) {

        for (Shape s1 : s) {
            s1.area();
        }
    }
}