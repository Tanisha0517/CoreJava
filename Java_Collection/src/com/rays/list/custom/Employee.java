package com.rays.list.custom;

public class Employee {
	private String name;
	private int id;
	private String company;
	private int salary;

	public Employee(String name, int id, String company, int salary) {
		this.name = name;
		this.id = id;
		this.company = company;
		this.salary = salary;
	}

	public String toString() {
		// + append krne k liye yha use krhe h

		return "name:" + name + ", rollno:" + id + ", subject:" + company + "salary:" + salary;

	}
}
