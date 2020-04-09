package com.threadgroup;

public class SystemThreadGroup {

	public static void main(String[] args) {

		Thread t1 = new Thread();
		System.out.println(t1.getThreadGroup().getName());
		
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		System.out.println("Thread Group Name:" + Thread.currentThread().getThreadGroup().getParent().getName());
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread thread : t) {
			System.out.println(thread.getName());
		}

	}

}
