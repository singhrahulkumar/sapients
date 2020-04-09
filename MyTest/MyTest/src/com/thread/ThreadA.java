package com.thread;

class ThreadB extends Thread {
	int total = 0;

	@Override
	public void run() {

		for (int i = 0; i <= 100; i++) {
			total = total + i;
		}
		this.notify();
	}
}

// overall example
public class ThreadA {

	public static void main(String[] args) {

		ThreadB b = new ThreadB();
		b.start();
		try {
			// it cause performance down
			
			// Thread.sleep(10);
			
			// if there is 1000 line of code after for loop then thread has to wait till
			// 1000 line completes
			//b.join();
			
			// if wait method is called here we will get illegal monitor exception
			//because it is not inside sync method
			b.wait();
			
		} catch (InterruptedException e) {
			System.out.println("Exception");
		}
		

		System.out.println(b.total);

	}

}
