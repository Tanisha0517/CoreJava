package com.rays.sort.comparable;

public class Employee implements Comparable<Employee>{
	private String companyName;
	private String name;
	private int salary;
	private int id;
 
	public Employee(String c, String n, int s, int i) {
		this.companyName = c;
		this.name = n;
		this.salary = s;
		this.id = i;
	}
	
	

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id; // asc int 
//		return o.rollNo - this.rollNo; // desc int
//		return this.name.compareTo(o.name); // asc string 
		//		return o.name.compareTo(this.name); //desc string
	}
	
	
	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", companyName: " + companyName + "salary: " + salary;
	}

	
}
