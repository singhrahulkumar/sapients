package com.thread.reentrantLock1;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockWithoutTime {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1("abhishek thread");
		MyThread1 t2 = new MyThread1("satyam thread");
		t1.start();
		t2.start();

	}

}

class MyThread1 extends Thread {

	static ReentrantLock l = new ReentrantLock();

	MyThread1(String name) {
		super(name);
	}

	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " performing safe operation");
			l.unlock();
		} else {
			System.out.println(Thread.currentThread().getName() + " performing unsafe operation");
		}
	}

}
