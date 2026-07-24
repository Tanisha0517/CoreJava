package com.rays.list;

import java.util.Stack;

public class StackTask {
	public static void main(String[] args) {

		Stack s1 = new Stack();

		for (char i = 'a'; i <= 'z'; i++) {
			s1.push(i);
		}
		System.out.println("s1 : " + s1);

		// Pop
//		for (char i = 'a'; i <= 'z'; i++) {
//			System.out.print(s1.pop());
//
//		}
//		
		Stack s2 = new Stack();
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(s2.push(s1.pop()));
		}

		System.out.println();
		System.out.println("s2 after push : " + s2);

	}
}
//Create two stack s1 and s2
//s1 = pushing values from a to z
//s2 = after pop one by one , storing values in it 
