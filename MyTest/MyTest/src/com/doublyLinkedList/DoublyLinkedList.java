package com.doublyLinkedList;

public class DoublyLinkedList {

	private Node head;

	static class Node {

		private Node previous;
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {

		DoublyLinkedList dll = new DoublyLinkedList();
		dll.add(1);
		dll.add(2);
		dll.add(3);
		dll.add(5);
		System.out.println("Full List");
		dll.printList();

		dll.addAfterGivenNode(dll.head.next.next, 4);
		System.out.println("After adding to given node " + dll.head.next.next.data);
		dll.printList();
		dll.addAtTheEnd(6);
		System.out.println("After adding to the end");
		dll.printList();

		// deletion

		System.out.println("After deleting from the end");
		dll.deleteFromEnd();
		dll.printList();
		System.out.println("After deleting node");
		Node n = dll.head;
		dll.deleteNode(n);
		dll.printList();

		// reverse doubly linked list
		dll.reverseLinkedList();
		dll.printList();

	}

	private void reverseLinkedList() {
		Node curr = head;
		while (curr != null) {
			Node nextNode = curr.next;
			Node temp = curr.previous;
			curr.previous = curr.next;
			curr.next = temp;
			head = curr;
			curr = nextNode;
		}
	}

	private void deleteNode(Node node) {

		if (head == null)
			return;

		if (node == head) {
			head = head.next;
		} else if (node.next == null) {
			node.previous.next = null;
		} else if (node.next != null) {
			node.next.previous = node.previous;
			node.previous.next = node.next;
		}
		return;

	}

	private void deleteFromHead() {

		Node curr = head;
		if (head == null) {
			return;
		} else {
			head = curr.next;
			curr.next.previous = null;
		}
	}

	private void deleteFromEnd() {
		Node curr = head;
		if (head == null) {
			return;
		} else {
			while (curr.next != null)
				curr = curr.next;
			curr.previous.next = null;
		}
	}

	private void addAtTheEnd(int i) {

		Node node = new Node(i);
		Node curr = head;

		if (head == null) {
			head = node;
		} else {
			while (curr.next != null)
				curr = curr.next;
			node.previous = curr;
			curr.next = node;
		}
	}

	private void addAfterGivenNode(Node prevNode, int i) {

		if (prevNode == null) {
			return;
		}
		Node node = new Node(i);
		node.next = prevNode.next;
		prevNode.next.previous = node;
		node.previous = prevNode;
		prevNode.next = node;
	}

	private void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	private void add(int data) {

		Node node = new Node(data);
		Node curr = head;

		if (head == null) {
			head = node;
		} else {
			while (curr.next != null)
				curr = curr.next;
			node.previous = curr;
			curr.next = node;
		}

	}

}
