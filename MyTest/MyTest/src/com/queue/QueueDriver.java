package com.queue;

public class QueueDriver {

	public static void main(String[] args) {

		Queue q = new Queue(5);
		q.deQueue();
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		q.enQueue(8);
		q.show();
	}
}
