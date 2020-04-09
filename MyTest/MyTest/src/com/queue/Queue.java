package com.queue;

public class Queue {

	int[] arr = new int[5];
	int front;
	int rear;
	int size;
	int capacity = 5;

	Queue(int arrSize) {
		arr = new int[arrSize];
		front = 0;
		rear = 0;
		capacity = arrSize;
		size = 0;
	}

	public void enQueue(int data) {
		if (!isFull()) {
			arr[rear] = data;
			rear = (rear + 1) % capacity;
			size++;
		} else {
			System.out.println("Size is full");
		}

	}

	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[(front + i) % capacity]);
		}

	}

	public void deQueue() {
		if (!isEmpty()) {
			int data = arr[front];
			front = (front + 1) % capacity;
			size--;
		} else {
			System.out.println("Empty queue");
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == 5;
	}

}
