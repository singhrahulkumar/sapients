package com.prepare;

class ThreadA extends Thread {
	
	int sum;

	@Override
	public void run() {
		System.out.println("executing child");

		synchronized (this) {
			for (int i = 0; i <= 100; i++) {
				sum = sum + i;
			}
			System.out.println("providing notification");
			notify();
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {

		ThreadA t = new ThreadA();
		t.start();
		synchronized (t) {

			System.out.println("Calling wait");
			System.out.println(t.sum);
			try {
				t.wait();
			} catch (InterruptedException e) {
			}
			System.out.println("Got notification");
			System.out.println(t.sum);

		}
	}

}
