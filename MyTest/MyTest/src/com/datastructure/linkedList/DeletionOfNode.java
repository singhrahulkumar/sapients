package com.datastructure.linkedList;

import com.datastructure.linkedList.LinkedList.Node;

public class DeletionOfNode {

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

		DeletionOfNode llist = new DeletionOfNode();
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(5);

		// llist.printList();
		llist.delete(3);
		llist.printList();
		
	}

	
	private void delete(int i) {
		if (head == null) {
			System.out.println("Node is empty");
			return;
		}
		Node previous = null;
		Node n = head;
		while (n != null) {
			if (n.data == i) {
				previous.next = n.next;
				break;
			}
			previous = n;
			n = n.next;
		}
	}

	private void add(int i) {
		Node n = new Node(i);
		if (head == null) {
			head = n;
			return;
		}
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = n;
	}

	private void printList() {

		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}

	}

}
