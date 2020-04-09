package com.threadgroup;

public class ThreadGroupDemo1 {

	public static void main(String[] args) {
		ThreadGroup parentThread = new ThreadGroup("ParentThread");

		// creating child thread group with parentThread group
		Thread t1 = new Thread(parentThread, "child thread 1");
		Thread t2 = new Thread(parentThread, "child thread 2");
		
		System.out.println(t1.getThreadGroup().getName());

		parentThread.setMaxPriority(3);
		Thread t3 = new Thread(parentThread, "child thread 3");
		System.out.println(t3.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t1.getPriority());


	}

}
