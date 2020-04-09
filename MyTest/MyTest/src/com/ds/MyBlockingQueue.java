package com.ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue<E> {

	private Queue<E> queue;
	private int max = 16;
	private ReentrantLock lock = new ReentrantLock();
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();

	public MyBlockingQueue(int size) {
		queue = new LinkedList<>();
		this.max = size;
	}

	public void put(E e) {
		lock.lock();
		try {
			while (queue.size() == max) {
				try {
					notFull.await();
				} catch (InterruptedException e1) {
				}
			}
			queue.add(e);
			notEmpty.signalAll();
		} finally {
			lock.unlock();
		}
	}

	public E take() {
		lock.lock();
		try {
			while (queue.size() == 0) {
				try {
					notEmpty.await();
				} catch (InterruptedException e) {
				}
			}
			E item = queue.remove();
			notFull.signalAll();
			return item;
		} finally {
			lock.unlock();
		}

	}

}
