package com.rays.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {

		Employee m1 = new Employee("TCS", "Aashu", 50000, 1);
		Employee m2 = new Employee("TCS", "Aashu", 60000, 3);
		Employee m3 = new Employee("TCS", "Aashu", 550000, 2);

		List<Employee> list = new ArrayList<Employee>();

		list.add(m1);
		list.add(m2);
		list.add(m3);

		list.forEach(System.out::println);

		Collections.sort(list);

		System.out.println("-------------------------------------------------------");
		list.forEach(System.out::println);

	}
}
