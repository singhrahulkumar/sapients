package com.thread.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

// whatever output we get using synchronized, same thing we get by using this output
class Display {

	ReentrantLock l = new ReentrantLock();

	public /* synchronized */ void wish(String name) {

		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(500);
				System.out.println(name);
			} catch (InterruptedException e) {
			}
		}
		l.unlock();
	}
}

class MyThread extends Thread {
	Display d;
	String name;

	MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class ReentrantLock1 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Hare Krishna");
		MyThread t2 = new MyThread(d, "Hare Rama");
		t1.start();
		t2.start();
	}

}
