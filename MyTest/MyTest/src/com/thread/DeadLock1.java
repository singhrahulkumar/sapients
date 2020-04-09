package com.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class Shared {
	public synchronized void method1(Shared s) {
		Thread t = Thread.currentThread();
		System.out.println("Executing thread in method1 :" + t.getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Calling method 2");
		s.method2(this);
		System.out.println("Finished method 1");
	}

	public synchronized void method2(Shared s) {
		Thread t = Thread.currentThread();
		System.out.println("Executing thread in method2 :" + t.getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Calling method 1");
		s.method1(this);
		System.out.println("Finished method 2");
	}
}

public class DeadLock1 {

	public static void main(String[] args) {

		final Shared s1 = new Shared();
		final Shared s2 = new Shared();

		Thread t1 = new Thread() {
			public void run() {
				s1.method1(s2);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				s2.method2(s1);
			}
		};

		t1.start();
		t2.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		long ids[] = bean.findMonitorDeadlockedThreads();
		ThreadInfo info[] = bean.getThreadInfo(ids);
		for (ThreadInfo threadInfo : info) {
			System.out.println("===================================");
			System.out.println(threadInfo.getThreadName());
			System.out.println(threadInfo.getThreadId());
			System.out.println(threadInfo.getLockName());
			System.out.println(threadInfo.getLockOwnerId());
			System.out.println(threadInfo.getLockOwnerName());
		}
	}

}
