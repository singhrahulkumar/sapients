package com.datastructure.circularlinkedList;

public class SplitCircularLinkedList {

	Node head;

	public static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		SplitCircularLinkedList l = new SplitCircularLinkedList();
		int arr[] = { 4, 1, 2, 3, 5 };
		for (int a : arr) {
			Node newNode = new Node(a);
			l.addNodeInSortedWay(newNode);
		}

		l.printList(l.head);

	}

	private void printList(Node head) {

		Node temp = head;
		do {
			System.out.println(temp.data);
			temp = temp.next;
		} while (temp != head);

	}

	private void addNodeInSortedWay(Node newNode) {

		Node current = head;

		if (head == null) {
			head = newNode;
			newNode.next = newNode;
		}

		else if (current.data >= newNode.data) {

			while (current.next != head)
				current = current.next;

			current.next = newNode;
			newNode.next = head;
			head = newNode;
		}

		else {
			while (current.next != head && current.next.data < newNode.data)
				current = current.next;
			newNode.next = current.next;
			current.next = newNode;
		}

	}

}
