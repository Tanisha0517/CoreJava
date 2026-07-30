package com.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamEvenOdd {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}

		list.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("Even: " + e));

		System.out.println("-------------------------------");
		
		list.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.println("Odd: " + e));

	}
}
