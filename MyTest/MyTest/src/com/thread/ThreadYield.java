package com.thread;

class MyThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("Child thread");
		}
	}

}

public class ThreadYield {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
		for (int i = 0; i < 10; i++) {
		//	Thread.currentThread().setPriority(1);
			System.out.println("Main thread");
		}
	}

}
