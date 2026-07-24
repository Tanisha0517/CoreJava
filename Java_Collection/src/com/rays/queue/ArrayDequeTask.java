package com.rays.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTask {
	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		q.add(1);
		q.add("Tanisha");
		q.add(2);
		q.add("Aayushi");
		q.add(3);

		System.out.println("Original Queue : " + q);

		Queue q1 = new ArrayDeque();

		int n = q.size();

		for (int i = 0; i < n; i++) {
			q1.add(q.poll());
		}

		System.out.println("Original Queue After Poll : " + q);
		System.out.println("Second Queue : " + q1);
	}
}





//package com.rays.queue.arraydeque;
//
//import java.util.ArrayDeque;
//import java.util.Queue;
//
//public class ArrayDequeTask {
//
//	public static void main(String[] args) {
//
//		Queue q = new ArrayDeque();
//
//		// Push
//		q.add(1);
//		q.add("Tanisha");
//		q.add(2);
//		q.add("Aayushi");
//		q.add(3);
//
//		System.out.println("Original Queue : " + q);
//
//		// Dusri Queue
//		Queue q1 = new ArrayDeque();
//
//		int n = q.size();
//
//		// Pop from first queue and store in second queue
//		for (int i = 0; i < n; i++) {
//
//			q1.add(q.remove());
//
//		}
//
//		System.out.println("Original Queue After Pop : " + q);
//		System.out.println("Second Queue : " + q1);
//	}
//}


