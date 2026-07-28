package com.rays.list.custom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMarksheetIterator {
public static void main(String[] args) {
	Marksheet m1 = new Marksheet("Ram",1,80,80,80);
	Marksheet m2 = new Marksheet("Shyam",2,60,80,80);
	Marksheet m3 = new Marksheet("Geeta",3,80,40,80);
	Marksheet m4 = new Marksheet("Ishu",4,80,30,80);
	Marksheet m5 = new Marksheet("Raju",5,80,50,80);
	
	List<Marksheet> list = new ArrayList<Marksheet>();
	
	list.add(m1);
	list.add(m3);
	list.add(m2);
	list.add(m5);
	list.add(m4);
	
	Iterator<Marksheet> i = list.iterator();
	
	while (i.hasNext()) {
		Marksheet m = i.next();
		System.out.println(m);
	}
}
}
