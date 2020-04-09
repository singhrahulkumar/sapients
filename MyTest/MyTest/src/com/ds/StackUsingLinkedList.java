package com.ds;

public class StackUsingLinkedList {
	Node root;

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		StackUsingLinkedList s = new StackUsingLinkedList();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		} else
			return root.data;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			int data = root.data;
			root = root.next;
			return data;
		}

	}

	public void push(int data) {
		Node node = new Node(data);
		if (root == null) {
			root = node;
		} else {
			node.next = root;
			root = node;
		}
	}

	public boolean isEmpty() {
		return root == null ? true : false;
	}

}
