package com.rays.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee("Tani", "Cognizant", 100000);
		Employee e2 = new Employee("aaniya", "Capgemini", 50000);
		Employee e3 = new Employee("cutey", "Accenture", 6450);

		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		
		OrderByName byName = new OrderByName();
		OrderByCompany byCompany = new OrderByCompany();
		OrderBySalary bySalary = new OrderBySalary();
		
		Collections.sort(list, byName);

		list.forEach(System.out::println);

		System.out.println("--------------");

		Collections.sort(list, byCompany);

		list.forEach(System.out::println);
		
		System.out.println("--------------");

		Collections.sort(list, bySalary);

		list.forEach(System.out::println);
	}
}
