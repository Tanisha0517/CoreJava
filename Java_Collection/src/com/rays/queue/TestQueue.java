package com.rays.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {

		Queue q = new ArrayDeque();
		q.add(1);
		q.add("Tanisha");
		q.add('t');
		q.add(true);
		q.offer(5);

		System.out.println("Queue : " + q);

		System.out.println("--------------");
		System.out.println("Remove Tanisha : " + q.remove("Tanisha"));
		System.out.println(q);

		System.out.println("--------------");
		System.out.println("poll()  :" + q.poll());
		System.out.println(q);

		System.out.println("--------------");
		System.out.println("element() : " + q.element());
		System.out.println(q);

		System.out.println("--------------");
		System.out.println("peek()  : " + q.peek());
		System.out.println(q);

	}

}
