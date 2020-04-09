package com.threadgroup;

class MyThread extends Thread {

	MyThread(ThreadGroup g, String name) {
		super(g, name);
	}

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("child thread");
	}
}

public class ThreadGroupDemo3 {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup pg = new ThreadGroup("parentGroup");
		System.out.println("Thread group: "+pg.getParent().getName());

		Thread t = new Thread(pg,"c1"); 
		System.out.println("Thread :"+t.getThreadGroup().getName());
		
		ThreadGroup cg = new ThreadGroup(pg, "childGroup");
		System.out.println("Child thread group :"+cg.getParent().getName());
		
		MyThread t1 = new MyThread(cg, "childThread1");
		MyThread t2 = new MyThread(cg, "childThread2");
		t1.start();
		t2.start();
		System.out.println("MyThread1 :"+t1.getThreadGroup().getName());
		System.out.println("MyThread2 :"+t2.getThreadGroup().getName());
		
		Thread[] tarr = new Thread[2];
		cg.enumerate(tarr);
		for (Thread thread : tarr) {
			System.out.println("-->"+thread.getName());
			
		}
		
		
		
		
		
		
		/*t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	//	Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();*/

	}

}
