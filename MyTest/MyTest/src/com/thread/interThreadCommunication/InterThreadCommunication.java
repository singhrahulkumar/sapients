package com.thread.interThreadCommunication;

class MyThreadB extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("Child thread start calculation");//2
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("Child thread trying to give notification");//3
			this.notify();
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {

		MyThreadB b = new MyThreadB();
		b.start();
		synchronized (b) {
			System.out.println("Main thread trying to call wait() method");//1
			try {
				b.wait();
			} catch (InterruptedException e) {
				System.out.println("Exception");
			}
			System.out.println("Main thread got notification");//4
			System.out.println(b.total);//5
		}
	}

}
