package com.johannpando.chapter10.listing10_3;

public class ShoppingCart {

	public static void main(String[] args) {
		Book book = new Book("Java");
		Thread task1 = new OnlineBuy(book);
		task1.start();

		Thread task2 = new OnlineBuy(book);
		task2.start();

		Thread task3 = new OnlineReturn(book);
		task3.start();
	}

}
