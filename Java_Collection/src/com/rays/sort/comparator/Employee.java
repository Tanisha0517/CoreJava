package com.rays.sort.comparator;

public class Employee {

	public String name;
	public String company;
	public int salary;

	public Employee(String n, String c, int s) {
		this.name = n;
		this.company = c;
		this.salary = s;
	}
	
	
	@Override
	public String toString() {
		return "Name=" + name + ", Company=" + company + ", Salary=" + salary;
	}

}
