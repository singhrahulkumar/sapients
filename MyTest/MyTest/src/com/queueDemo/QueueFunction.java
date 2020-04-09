package com.queueDemo;

public class QueueFunction {

	final static int MAX = 5;
	int front = 0;
	int rear = -1;
	int size = 0;
	int[] queue = new int[MAX];

	public boolean isFull() {
		if (size == MAX) {
			System.out.println("queue is full");
			return true;
		}
		return false;
	}

	public void enqueue(int data) {
		if (isFull())
			return;
		rear = (rear + 1) % MAX;
		size++;
		queue[rear] = data;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return Integer.MIN_VALUE;
		}

		front = front % MAX;
		size--;
		int data = queue[front++];
		return data;
	}

	private boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

}
