package com.datastructure.circularlinkedList;

// node insertion in front end at given index
public class NodeInsertion {

	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		NodeInsertion n = new NodeInsertion();
		n.push(4);
		n.push(3);
		n.push(5);
		n.printList();

		// insert at the end
		n.insertAtTheEnd(6);
		System.out.println("After insertion");
		n.printList();

		// insert at the beginning
		n.insertAtFront(1);
		System.out.println("After insertion in front");
		n.printList();
		System.out.println(n.head.data);
		n.insertAtGivenIndex(8, 8);
		System.out.println("After in index in front");
		n.printList();

	}

	private void insertAtGivenIndex(int i, int m) {

		Node node = new Node(m);
		if (head == null)
			return;

		Node temp = head;
		Node prevNode = null;
		for (int k = 1; temp.next != head && k != i; k++) {
			prevNode = temp;
			temp = temp.next;
		}
		if (temp.next == head) {
			temp.next = node;
			node.next = head;
		} else {
			node.next = temp;
			prevNode.next = node;
		}

	}

	private void insertAtFront(int i) {

		Node ptr1 = new Node(i);
		Node temp = head;
		if (head == null) {
			ptr1.next = ptr1;

		} else {
			while (temp.next != head)
				temp = temp.next;

			ptr1.next = head;
			temp.next = ptr1;
		}
		head = ptr1;

	}

	private void insertAtTheEnd(int i) {
		Node temp = head;
		Node ptr1 = new Node(i);

		if (head == null) {
			ptr1.next = ptr1;
			head = ptr1;
		} else {
			while (temp.next != head)
				temp = temp.next;

			temp.next = ptr1;
			ptr1.next = head;
		}

	}

	private void printList() {

		Node temp = head;

		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

	private void push(int i) {

		Node ptr1 = new Node(i);
		Node temp = head;

		if (head == null) {
			ptr1.next = ptr1;
			head = ptr1;
		} else {
			while (temp.next != head)
				temp = temp.next;
			temp.next = ptr1;
			ptr1.next = head;
		}
	}

}
