package com.rays.sort.comparable;

public class Student implements Comparable<Student > {

	private String name;
	private int percentage;
 
	public Student(String n, int p) {
		this.name = n;
		this.percentage = p;
		
	}
	
	public String toString() {
		return "Percentage : " + percentage + ", name: " + name; 
	}


		
	@Override
	public int compareTo(Student o) {
//		return this.percentage - o.percentage; // asc int 
//		return o.percentage - this.percentage; // desc int
		return this.name.compareTo(o.name); // asc string 
		//		return o.name.compareTo(this.name); //desc string
	}
	
	

}