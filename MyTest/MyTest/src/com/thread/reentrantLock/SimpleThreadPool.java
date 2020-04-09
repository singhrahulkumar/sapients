package com.thread.reentrantLock;

import java.util.LinkedList;

public class SimpleThreadPool {
	public WorkerThread[] thread;
	public LinkedList<Runnable> taskQueue;

	public SimpleThreadPool(int numberOfThreadForPool) {
		this.taskQueue = new LinkedList<>();
		this.thread = new WorkerThread[numberOfThreadForPool];
		for (int i = 0; i < numberOfThreadForPool; i++) {
			thread[i] = new WorkerThread();
			thread[i].start();
		}
	}

	public void execute(Runnable r) {
		synchronized (taskQueue) {
			taskQueue.addLast(r);
			taskQueue.notify();
		}
	}

	public class WorkerThread extends Thread {
		Runnable r;
		@Override
		public void run() {
			while (true) {
				synchronized (taskQueue) {
					while (taskQueue.isEmpty()) {
						try {
							wait();
						} catch (InterruptedException e) {
						}
					}
					r = taskQueue.removeFirst();
				}
				try {
					r.run();
				} catch (Exception e) {

				}
			}
		}

	}

}
