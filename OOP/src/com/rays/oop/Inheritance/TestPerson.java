package com.rays.oop.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		System.out.println("=========BusinessMan==========");

		Businessman b = new Businessman();
		b.setname("Tanisha");
		System.out.println("Name : " + b.getname());
		b.setaddress("Indore");
		System.out.println("Address : " + b.getaddress());
		b.setDate(sdf.parse("05-05-2004"));
		System.out.println("Date of birth : " + sdf.format(b.getDate()));
		b.setincome(1000000);
		System.out.println("Income : " + b.getincome());

		System.out.println("=======Doctor==========");

		Doctor d = new Doctor();
		d.setname("AAyushi");
		System.out.println("Name : " + d.getname());
		d.setaddress("Pune");
		System.out.println("Address : " + d.getaddress());
		d.setDate(sdf.parse("04-09-2004"));
		System.out.println("Date of birth : " + sdf.format(d.getDate()));

		d.setRegistrationNo("50");
		System.out.println("Registration No : " + d.getRegistration());

		System.out.println("=========Student==========");
		Student s = new Student();
		s.setrollNo("5");
		System.out.println("Roll No : " + s.getrollNo());

		s.setmarks(80);
		System.out.println("Marks : " + s.getmarks());

		s.setname("Meet");
		System.out.println("Name : " + s.getname());
		s.setaddress("Banglore");
		System.out.println("Address : " + s.getaddress());
		s.setDate(sdf.parse("21-12-2005"));
		System.out.println("Date of birth : " + sdf.format(s.getDate()));

	}
}