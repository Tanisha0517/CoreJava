package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStream {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Taniya");
		list.add("Taniya");
		list.add("Ishu");
		list.add("Aashu");
		list.add("Disha");
		
		System.out.println("----------Ascending order of list----------");
		list.stream().distinct().sorted().forEach(System.out::println);
		
		System.out.println("----------Descending order of list---------");
		list.stream().distinct().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		
		System.out.println("----------Uppercase of list----------------");
		list.stream().distinct().sorted().map(e->e.toUpperCase()).forEach(System.out::println);

		System.out.println("----------LowerCase of list----------------");
		list.stream().distinct().sorted().map(e->e.toLowerCase()).forEach(System.out::println);
		
		System.out.println("-------------StartsWith--------------------");
		list.stream().distinct().filter(e->e.startsWith("T")).forEach(System.out::println);
		
		System.out.println("-------------EndsWith----------------------");
		list.stream().distinct().filter(e->e.endsWith("u")).forEach(System.out::println);
		
		
	}
}
