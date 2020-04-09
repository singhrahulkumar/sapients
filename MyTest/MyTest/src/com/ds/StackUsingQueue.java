package com.ds;

public class StackUsingQueue {

	Queue q1 = new Queue();
	Queue q2 = new Queue();

	public static void main(String[] args) {

		StackUsingQueue s = new StackUsingQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(8);
		s.pop();
		s.pop();
	}

	private void pop() {
		System.out.println(q1.dequeue());
	}

	/**
	 * if q1 is empty add in q1... else if q1 is not empty then add all element of
	 * q1 to q2.... then add given element in q1..... then add all element of q2 to
	 * q1
	 */
	private void push(int data) {
		if (q1.isEmpty()) {
			q1.enqueue(data);
		} else {
			while (!q1.isEmpty()) {
				q2.enqueue(q1.dequeue());
			}
			q1.enqueue(data);
			while (!q2.isEmpty()) {
				q1.enqueue(q2.dequeue());
			}
		}

	}

}
