package com.queueDemo;

public class QueueDriver {

	public static void main(String[] args) {

		QueueFunction q = new QueueFunction();
		q.enqueue(8);
		q.enqueue(7);
		q.enqueue(3);
		q.enqueue(88);
		q.enqueue(66);
		q.enqueue(37);
		System.out.println();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(37);
		q.enqueue(27);
		System.out.println(q.dequeue());
	}

}
