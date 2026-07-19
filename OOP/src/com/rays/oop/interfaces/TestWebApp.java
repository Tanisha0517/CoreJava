package com.rays.oop.interfaces;

public class TestWebApp {
	public static void main(String[] args) {

		Light l = new WebApp();

		l.lighttheme();

		System.out.println("----------------");

		Dark d = new WebApp();

		d.darktheme();
	}
}
