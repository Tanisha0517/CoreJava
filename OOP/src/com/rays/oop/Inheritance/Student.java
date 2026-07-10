package com.rays.oop.Inheritance;

public class Student extends Person{
	protected String rollNo;
	protected int marks;

	public void setrollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getrollNo() {
		return rollNo;
	}

	public void setmarks(int marks) {
		this.marks = marks;
	}

	public int getmarks() {
		return marks;
	}
}
