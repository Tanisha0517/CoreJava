package com.rays.collection;

import java.util.ArrayList;
//import java.util.*;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(45);// Object of integer class
		c.add("Orange");
		c.add(10.0);
		c.add('t');
		c.add(true);

		System.out.println("Size of c is : " + c.size());

		System.out.println("-------------------------");

		System.out.println(c);

		System.out.println("Mango is available : " + c.contains("Mango"));
		System.out.println("Orange is available : " + c.contains("Orange"));

		c.remove("Orange");

		System.out.println("--------------------------");
		System.out.println("Orange is available : " + c.contains("Orange"));
		System.out.println("New size of c : " + c.size());

		c.clear();
		System.out.println("New size of c : " + c.size());

	}
}

//add
//remove
//size
//clear
//contain