package com.datastructure.circularlinkedList;

public class CLLDemo {

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Node head = null;

		head = push(head, 11);
		head = push(head, 9);
		head = push(head, 7);
		head = push(head, 3);

		traverse(head);
	}

	private static Node push(Node head_ref, int data) {

		Node ptr1 = new Node(data);
		Node temp = head_ref;

		if (head_ref == null) {
			ptr1.next = ptr1;

		} else {
			while (temp.next != head_ref) {
				temp = temp.next;
			}
			ptr1.next = head_ref;
			temp.next = ptr1;

		}
		head_ref = ptr1;
		return head_ref;
	}

	public static void traverse(Node head_ref) {
		Node temp = head_ref;

		do {
			System.out.print(temp.data + " ");
			temp = temp.next;
		} while (temp != head_ref);
		System.out.println();

	}

}
