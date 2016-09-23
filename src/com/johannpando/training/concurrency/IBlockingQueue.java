package com.johannpando.training.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class IBlockingQueue {

	public static void main(String[] args) {

		BlockingQueue<Clase> bq = new ArrayBlockingQueue<>(10);
		try {
			bq.put(new Clase("clase1"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Clase clase = bq.take();
			System.out.println(clase.name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BlockingQueue<Request> queue = new ArrayBlockingQueue<>(3);

		Client client = new Client(queue);
		Producer producer = new Producer(queue);

		new Thread(client).start();
		new Thread(producer).start();

	}

}

class Clase {

	String name;

	public Clase(String name) {
		this.name = name;
	}
}

class Request {

}

class Client implements Runnable {

	private BlockingQueue<Request> queue;

	public Client(BlockingQueue<Request> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			Request request = null;
			while (true) {
				request = new Request();
				queue.put(request);
				System.out.println("add request - " + request);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable {

	private BlockingQueue<Request> queue;

	public Producer(BlockingQueue<Request> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("procesando " + queue.take());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}