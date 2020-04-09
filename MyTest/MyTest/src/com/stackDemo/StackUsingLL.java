package com.stackDemo;

public class StackUsingLL {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		StackUsingLL s = new StackUsingLL();
		for (int i = 1; i <= 10; i++) {
			s.push(i);
		}
		System.out.println("---------------------------");
		System.out.println(s.peek());
		System.out.println("---------------------------");
		for (int i = 1; i <= 10; i++) {
			int d = s.pop();
			System.out.println(d);
		}
		System.out.println("---------------------------");
		System.out.println(s.isEmpty());

	}

	private void push(int i) {
		StackNode node = new StackNode(i);
		if (root == null) {
			root = node;
		} else {
			StackNode temp = root;
			node.next = temp;
			root = node;
		}
		System.out.println("Pushed element " + i);
	}

	private int pop() {
		int popped = Integer.MIN_VALUE;
		if (root == null) {
			System.out.println("Empty Stack");
		} else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}

	private int peek() {
		if (root == null) {
			System.out.println("Empty stack");
			return Integer.MIN_VALUE;
		} else {
			return root.data;
		}
	}

	private boolean isEmpty() {
		if (root == null)
			return true;
		else
			return false;
	}

}
