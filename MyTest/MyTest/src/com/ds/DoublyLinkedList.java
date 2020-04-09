package com.ds;

public class DoublyLinkedList {
	Node root;

	public static class Node {
		Node prev;
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		d.add(1);
	}

	private void add(int i) {
		
	}

}
