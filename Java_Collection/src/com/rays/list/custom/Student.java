//encapsulation we r doing here so thts why the attributes are private 

package com.rays.list.custom;

public class Student {

	private String name;
	private int rollNo;
	private String subject;

	public Student(String name, int rollNo, String subject) {
		this.name = name;
		this.rollNo = rollNo;
		this.subject = subject;
	}	
		
    public String toString() {
    	// + append krne k liye yha use krhe h 
    	return "name:" + name + ", rollno:" +rollNo + ", subject:" +subject;
    
	}
}

