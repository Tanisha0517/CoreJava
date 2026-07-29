package com.rays.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {

		Student s1 = new Student("Aashu", 90);
		Student s2 = new Student("Aadya", 95);
		Student s3 = new Student("Vishu", 80);

		List<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		list.forEach(System.out::println);
		
		Collections.sort(list);
		
		System.out.println("------------------------------------------------");
		
		list.forEach(System.out::println);

	}
}
