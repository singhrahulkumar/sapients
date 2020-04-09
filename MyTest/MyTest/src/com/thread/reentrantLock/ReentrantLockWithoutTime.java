package com.thread.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

class MyThread2 extends Thread {

	static ReentrantLock l = new ReentrantLock();

	public MyThread2(String name) {
		super(name);
	}

	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " performing safe operation");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			l.unlock();
		} else {
			System.out.println(Thread.currentThread().getName() + " performing unsafe operation");
		}
	}
}

public class ReentrantLockWithoutTime {

	public static void main(String[] args) {
		MyThread2 thread1 = new MyThread2("First thread");
		MyThread2 thread2 = new MyThread2("Second thread");
		thread1.start();
		thread2.start();
	}

}
