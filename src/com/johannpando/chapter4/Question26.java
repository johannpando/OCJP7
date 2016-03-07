package com.johannpando.chapter4;

import java.util.PriorityQueue;

/**
 * PriorityQueue is a collection in which the elements are ordered according to
 * natural ordering.
 * 
 * The PriorityQueue.poll() method retrieves and removes the head of the queue
 * or return null if the queue is empty.
 * 
 * The Priority.peek() method retrieves but does not remove the head of the
 * queue or returns null if the queue is empty.
 * 
 * @author jpandode
 *
 */
public class Question26 {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("banana");
		pq.add("pear");
		pq.add("apple");
		
		System.out.println("Imprimendo pq: " + pq);

		System.out.println("PriorityQueue pq original");

		for (String string : pq) {
			System.out.println(string);
		}

		System.out.println(pq.poll() + " " + pq.peek());

		System.out.println("PriorityQueue después de ejecutar poll and peek");

		for (String string : pq) {
			System.out.println(string);
		}
	}

}
