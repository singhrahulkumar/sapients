package com.datastructure.linkedList;

public class LLNodeAtTheEnd {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {

		LLNodeAtTheEnd llist = new LLNodeAtTheEnd();
		llist.head = new Node(1);

		Node second = new Node(2);
		Node third = new Node(3);
		llist.head.next = second;
		second.next = third;
		int value = 4;
		llist.addNodeAtEnd(value);
		llist.printList();

	}

	private void printList() {

		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}

	}

	private void addNodeAtEnd(int value) {

		Node fourth = new Node(4);
		if (head == null) {
			head = fourth;
			return;
		}

		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = fourth;
	}

}
