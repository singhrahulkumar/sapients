package com.thread.interThreadCommunication;

class MyRunnable implements Runnable {

	int reminder;
	static Object lock = new Object();
	static int number = 1;

	MyRunnable(int r) {
		this.reminder = r;
	}

	@Override
	public void run() {

		while (number <= 20) {
			synchronized (lock) {
				while (number % 3 != reminder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
					}
				}
				System.out.print(number + " ");
				number++;
				lock.notifyAll();
			}
		}

	}

}

public class PrintConsecutiveUsingThreeThread {

	public static void main(String[] args) {

		MyRunnable r1 = new MyRunnable(1);
		MyRunnable r2 = new MyRunnable(2);
		MyRunnable r3 = new MyRunnable(0);

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

	}

}
