package com.ds;

public class LinkedList {

	Node root;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();

		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();

/*		l1.add(1);
		l1.add(2);
		l1.add(3);
		l2.add(1);
		l2.add(3);
		l2.add(5);*/

//		sort(l1, l2);

		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.traverse();

		l.traverse();
		l.removeByData(8);
		l.traverse();
		l.addAtFirst(66);
		l.traverse();

		l.middleElement();
		l.nThLastElementFromLikedList(3);
		l.reverseLinkedList();
		l.traverse();
		l.reverseLinkedList1();
		l.traverse();

	}

	private void reverseLinkedList1() {
		Node prev = null;
		Node cn = root;
		Node c = root;
		
		while(c != null) {
			cn = c.next;
			c.next = prev;
			prev = c;
			c = cn;
		}
		root = prev;
	}

	private static void sort(LinkedList l1, LinkedList l2) {
	}

	private void nThLastElementFromLikedList(int index) {
		Node c1 = root;
		Node c2 = root;
		while (c1 != null) {
			int i = 0;
			while (i < index) {
				c1 = c1.next;
				i++;
			}
			int j = 0;
			while (c1 != null && j < index) {
				c2 = c2.next;
				j++;
			}

		}
		System.out.println(c2.data);
	}

	private void middleElement() {
		if (root == null)
			return;
		Node c1 = root;
		Node c2 = root;

		while (c1.next != null && c1.next.next != null) {
			c1 = c1.next.next;
			c2 = c2.next;
		}
		System.out.println("Middle element :" + c2.data);
	}

	private void reverseLinkedList() {

		Node temp = root;
		Node prev = null;
		Node curr = root;
		while (temp != null) {
			// store next value
			temp = temp.next;
			// current next to previous element
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		root = prev;

	}

	private void addAtFirst(int data) {
		Node node = new Node(data);
		if (root == null)
			root = node;
		else {
			node.next = root;
			root = node;
		}

	}

	private void removeByData(int data) {
		Node prev = null;
		for (Node temp = root; temp != null; temp = temp.next) {
			if (temp.data == data) {
				prev.next = temp.next;
				break;
			}
			prev = temp;
		}
	}

	private void traverse() {
		Node temp = root;
		if (root == null)
			return;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	private void add(int data) {
		Node node = new Node(data);
		Node temp = root;
		if (root == null)
			root = node;
		else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

}
