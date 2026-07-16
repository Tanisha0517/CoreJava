package com.rays.oop.Constructor;

public class TestPerson {
	public static void main(String[] args) {

		Person p1 = new Person("Tanisha", "Indore");
		
		System.out.println("Person 1 Name : " + p1.getName());
		System.out.println("Person 1 Address : " + p1.getAddress());
		
		System.out.println("---------------------------");
		
		Person p2 = new Person("Meet", "Mumbai");
		
		System.out.println("Person 2 Name : " +p2.getName());
		System.out.println("Person 2 Address : " +p2.getAddress());
	}
}
