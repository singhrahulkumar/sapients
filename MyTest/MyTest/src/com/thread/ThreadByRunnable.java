package com.thread;

class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print("Child thread --> ");
			Thread.currentThread().setName("Iron man");
			System.out.println(Thread.currentThread().getName());
		}
	}

}

public class ThreadByRunnable {

	public static void main(String[] args) {

		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		t.setPriority(10);
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
		
	}

}
