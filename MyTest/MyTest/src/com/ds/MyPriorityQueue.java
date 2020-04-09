package com.ds;

public class MyPriorityQueue {

	int max;
	private int[] arr;
	private int nItem;

	public MyPriorityQueue() {
		this.max = 5;
		arr = new int[max];
		nItem = 0;
	}

	public static void main(String[] args) {
		MyPriorityQueue queue = new MyPriorityQueue();
		queue.add(8);
		queue.add(10);
		queue.add(6);
		queue.add(11);
		queue.add(5);
		queue.add(22);
		// queue.add(2);
		queue.traverse();
	}

	private void add(int data) {

		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}

		if (nItem == 0) {
			arr[0] = data;
			nItem++;
			return;
		}
		int i;
		for (i = nItem - 1; i >= 0; i--) {
			if (arr[i] < data) {
				arr[i + 1] = arr[i];
			} else {
				break;
			}
		}
		arr[i + 1] = data;
		nItem++;
	}

	public void traverse() {
		for (int i = 0; i < nItem; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public int remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		return arr[--nItem];
	}

	public boolean isFull() {
		return nItem == max;
	}

	public boolean isEmpty() {
		return nItem == 0;
	}

}
