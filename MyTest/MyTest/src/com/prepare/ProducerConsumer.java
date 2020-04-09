package com.prepare;

import java.util.LinkedList;

public class ProducerConsumer {

	public static void main(String[] args) throws InterruptedException {

		final PC pc = new PC();

		Runnable r = () -> {
			try {
				pc.produce();
			} catch (InterruptedException e) {
			}
		};

		Thread p = new Thread(r);

		Runnable r1 = () -> {
			try {
				pc.consume();
			} catch (InterruptedException e) {
			}
		};

		Thread c = new Thread(r1);
		p.start();
		c.start();
		System.out.println("A");
	}

}

class PC {
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 2;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (list.size() == capacity)
					wait();
				System.out.println("producer produces = " + value);
				list.add(value++);
				System.out.println(list);
				notify();
				Thread.sleep(3000);
			}

		}
	}

	public void consume() throws InterruptedException {

		while (true) {
			synchronized (this) {
				while (list.size() == 0)
					wait();
				int val = list.removeFirst();
				System.out.println("Consumed = " + val);
				System.out.println(list);
				notify();
				Thread.sleep(1000);
			}
		}

	}
}
