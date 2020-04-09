package com.thread.reentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread3 extends Thread {

	static ReentrantLock l = new ReentrantLock();

	MyThread3(String name) {
		super(name);
	}

	public void run() {
		while (true) {
			try {
				if (l.tryLock(1000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + " Aquired the lock and sleeping");
					Thread.sleep(5000);
					l.unlock();
					System.out
							.println(Thread.currentThread().getName() + " Released the lock and coming out from loop");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " trying to get the lock");
				}
			} catch (InterruptedException e) {
			}
		}
	}

}

public class ReentrantTryLockWithTime {

	public static void main(String[] args) {

		MyThread3 t1 = new MyThread3("First thread");
		MyThread3 t2 = new MyThread3("Second thread");
		t1.start();
		t2.start();
	}

}
