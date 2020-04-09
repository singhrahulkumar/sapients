package com.ds;

public class RemoveDuplicateFromLikedList {

	static class Node {
		int data;
		Node next;

		Node(int tmp) {
			data = tmp;
		}
	}

	static void printLinkedList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		Node n1 = new Node(23);
		Node n2 = new Node(29);
		Node n3 = new Node(29);
		Node n4 = new Node(45);
		Node n5 = new Node(45);
		Node n6 = new Node(45);
		Node n7 = new Node(54);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;

		System.out.print("Initial linked list data: ");
		printLinkedList(n1);
		deleteDuplicates(n1);
		System.out.println();
		System.out.print("Linked list data after removing duplicates: ");
		printLinkedList(n1);
	}

	private static void deleteDuplicates(Node head) {
		Node curr = head;
		while (curr != null) {
			Node temp = curr;
			while (temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}

}
