package com.johannpando._4_;

import java.util.LinkedList;
import java.util.Queue;

public class Question6 {

	public static void main(String[] args) {

		Queue<String> row = new LinkedList<String>();
		row.add("OR");
		row.add("CA");
		row.add("MO");
		
		display(row);
	}

	public static void display(Queue row){
		row.add(new Integer(94123));
		while (!row.isEmpty()) {
			System.out.print(row.poll() + " ");
		}
	}
}
