package com.datastructure.linkedList;

public class LLNodeAfterGivenNode {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {

		
		
		LLNodeAfterGivenNode llist = new LLNodeAfterGivenNode();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fivth = new Node(5);
		Node sixth = new Node(6);

		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fivth;
		fivth.next = sixth;

		int data = 7;
		llist.addNodeAfterGivenNode(third, data);
		
		llist.printlist();
	}

	private void printlist() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	private void addNodeAfterGivenNode(Node third, int data) {

		if (third == null) {
			return;
		}
		Node seventh = new Node(7);
		seventh.next = third.next;
		third.next = seventh;
	}
}
