package com.threadgroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		ThreadGroup g = new ThreadGroup("parent group");
		ThreadGroup g1 = new ThreadGroup(g, "child group");

		System.out.println(g.getParent().getName());
		System.out.println(g1.getParent().getName());

	}

}
