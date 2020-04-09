package com.thread.reentrantLock1;

import java.util.concurrent.locks.ReentrantLock;

public class ReterantLock1 {

	public static void main(String[] args) {
		Display d = new Display();
	//	Display d1 = new Display();
		MyThread t1 = new MyThread(d, "Abhishek");
		MyThread t2 = new MyThread(d, "Ankit");
		t1.start();
		t2.start();
	}

}

class Display {
	ReentrantLock l = new ReentrantLock();
	public void display(String name) {
		l.lock();
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
			System.out.println(name);
		}
		l.unlock();
		
	}
}

class MyThread extends Thread {

	Display d;
	String name;

	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.display(name);
	}

}
