package com.ds;

public class Queue {

	int size;
	int capacity = 5;
	int rear;
	int front;
	int arr[] = new int[capacity];

	public static void main(String[] args) {
		Queue q = new Queue();
	
		q.dequeue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.dequeue();
		q.enqueue(6);
		q.enqueue(7);
	}

	public boolean enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
			return false;
		} else {
			arr[rear] = data;
			rear = (rear + 1) % capacity;
			size++;
			return true;
		}
	}

	public boolean isFull() {
		return size == capacity ? true : false;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Empty queue");
			return -1;
		} else {
			int data = arr[front];
			front = (front + 1) % capacity;
			size--;
			return data;
		}
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

}
