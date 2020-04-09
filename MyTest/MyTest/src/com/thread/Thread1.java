package com.thread;

class MyThread extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}

}

public class Thread1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setPriority(10);
		t.start();

		// t.start(); // illegal state exception
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}

}
