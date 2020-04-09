package com.datastructure.circularlinkedList;

// creating a new Circular linked list and adding node
// traversing circular linked list
public class CircularLinkedList {

	public static class Node {
		int data;
		Node next;
	}

	public static void main(String[] args) {
		Node head = null;

		head = push(head, 11);
		head = push(head, 9);
		head = push(head, 7);
		head = push(head, 3);
		traverse(head);
		// split into two
		splitHead(head);
	}

	private static void splitHead(Node head) {

		Node slowPtr = head;
		Node fastPtr = head;

		if (head == null)
			return;

		if (head == head.next)
			return;

		while (fastPtr.next != head && fastPtr.next.next != head) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		while (fastPtr.next != head && fastPtr.next.next != head) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		// for even node
		if (fastPtr.next.next == head)
			fastPtr = fastPtr.next;

		Node head1 = head;
		Node head2 = slowPtr.next;

		slowPtr.next = head1;
		fastPtr.next = head2;

		System.out.println("After split: List 1");
		traverse(head1);
		System.out.println("After split: List 2");
		traverse(head2);

	}

	public static void traverse(Node head_ref) {
		Node temp = head_ref;

		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head_ref);
		System.out.println();

	}

	public static Node push(Node head_ref, int data) {
		Node ptr1 = new Node();
		ptr1.data = data;
		ptr1.next = head_ref;

		Node temp = head_ref;

		if (head_ref != null) {
			while (temp.next != head_ref)
				temp = temp.next;
			temp.next = ptr1;
		} else {
			ptr1.next = ptr1;
		}

		head_ref = ptr1;
		return head_ref;
	}

}
