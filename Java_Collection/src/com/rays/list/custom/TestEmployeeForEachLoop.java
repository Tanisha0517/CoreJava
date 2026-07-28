package com.rays.list.custom;

import java.util.ArrayList;
import java.util.List;

public class TestEmployeeForEachLoop {
	public static void main(String[] args) {
		Employee e1 = new Employee("Tanisha", 1, "Cognizant", 100000);
		Employee e2 = new Employee("Aayu", 2, "Wipro", 500140);
		Employee e3 = new Employee("Meet", 4, "Capgemini", 458712);

		List<Employee> list = new ArrayList<Employee>();

		list.add(e1);
		list.add(e2);
		list.add(e3);

		for (Employee e : list) {
			System.out.println(e);
		}

	}
}
