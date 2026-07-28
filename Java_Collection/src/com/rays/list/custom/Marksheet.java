package com.rays.list.custom;

public class Marksheet {

	
	private String name;
	private int rollNo;
	private int social;
	private int science;
	private int computer;
	
	public Marksheet(String name, int rollNo, int social, int science, int computer) {
		this.computer = computer;
		this.name = name;
		this.rollNo = rollNo;
		this.science = science;
		this.social = social;
	}
	
	public String toString(){
		return "Name : " +name + "Roll No : " +rollNo + "Social : " +social + "Science : " +science + "Computer : " +computer;
	}
}
