package com.johannpando.chapter10._10_3._2.threadInterference;

public class Book {

	String title;
	int copiesSold = 0;

	Book(String title) {
		this.title = title;
	}

	// Sentencias no atomica incluye carga de valor de variable desde el
	// registro de memoria manipulando los valores, y cargándolos nevamente a la
	// memoria.

	public int newSale() {
		return ++copiesSold;
	}

	public int returnBook() {
		return --copiesSold;
	}

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

class OnlineBuy extends Thread {

	private Book book;

	public OnlineBuy(Book book) {
		this.book = book;
	}

	@Override
	public void run() {
		System.out.println(book.newSale());
	}

}

class OnlineReturn extends Thread {

	private Book book;

	public OnlineReturn(Book book) {
		this.book = book;
	}

	@Override
	public void run() {
		System.out.println(book.returnBook());
	}
}