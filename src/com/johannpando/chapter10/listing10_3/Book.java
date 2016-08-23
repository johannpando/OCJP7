package com.johannpando.chapter10.listing10_3;

public class Book {

	String title;
	int copiesSold = 0;

	Book(String title) {
		this.title = title;
	}

	// Sentencias no atomica incluye carga de valor de variable desde el
	// registro de memoria manipulando los valores, y cargándolos nevamente a la
	// memoria.

	synchronized public int newSale() {
		return ++copiesSold;
	}

	synchronized public int returnBook() {
		return --copiesSold;
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
