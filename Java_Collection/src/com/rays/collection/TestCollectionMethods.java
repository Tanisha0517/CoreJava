package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethods {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add(45);// Object of integer class
		c1.add("Orange");
		c1.add(10.0);
		c1.add('t');
		c1.add(true);

		System.out.println("Size of c1 : " + c1.size());
		System.out.println(c1);

		System.out.println("--------------------------------------------------------");

		Collection c2 = new ArrayList();

		c2.add(55);// Object of integer class
		c2.add("Pink");
		c2.add(5.0);
		c2.add('r');

		System.out.println("Size of c1 : " + c2.size());
		System.out.println(c2);

		System.out.println("-------------------------------------------------------");

		System.out.println(c1.containsAll(c2)); // false

		c1.addAll(c2);
		System.out.println(c1.containsAll(c2)); // true

		System.out.println("New size of c1 after adding c2 : " + c1.size());
		System.out.println("New c1 after adding c2 : " + c1);

		c1.removeAll(c2);
		System.out.println("New size of c1 after removing c2 : " + c1.size());
		System.out.println("New c1 after removing c2 : " + c1);

		System.out.println("------------------------------------------------------");

		System.out.println(c1.isEmpty()); // false
		c1.clear();
		System.out.println(c1.isEmpty()); // true
		
		System.out.println("-------------------------------------------------------");

		System.out.println("Retain Method : " + c1.retainAll(c2));

		System.out.println(c1);
	}

}

//removeAll
//addAll
//ContainsAll
//isEmpty
//retainAll
