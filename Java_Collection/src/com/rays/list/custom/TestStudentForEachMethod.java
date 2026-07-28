package com.rays.list.custom;

import java.util.ArrayList;
import java.util.List;

public class TestStudentForEachMethod {
	public static void main(String[] args) {
		Student s1 = new Student("Tanisha", 1, "Maths");
		Student s2 = new Student("Aayushi", 2, "Physics");
		Student s3 = new Student("Meet", 4, "Chemistry");
		Student s4 = new Student("Tisha", 5, "Biology");
		Student s5 = new Student("Ayana", 3, "Maths");

		List<Student> list = new ArrayList<Student>();

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		list.forEach(System.out::println);

	}
}
