package com.rays.list.custom;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeForEachMethod {
	public static void main(String[] args) {
		Employee e1 = new Employee("Tanisha", 1, "Cognizant", 100000);
		Employee e2 = new Employee("Aayu", 2, "Wipro", 50014);
		Employee e3 = new Employee("Meet", 4, "Capgemini", 45871);
		Employee e4 = new Employee("Me", 5, "Capgemini", 458710);

		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		list.forEach(System.out::println);

	}
}
