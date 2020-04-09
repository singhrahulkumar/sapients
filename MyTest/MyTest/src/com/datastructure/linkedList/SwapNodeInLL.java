package com.datastructure.linkedList;

public class SwapNodeInLL {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node() {

		}

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {

		SwapNodeInLL llist = new SwapNodeInLL();
		llist.head = new Node(9);
		Node first = new Node(10);
		Node second = new Node(12);
		Node third = new Node(14);
		Node fourth = new Node(16);
		Node fivth = new Node(18);

		llist.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fivth;
		System.out.println("Before swap");
		
		llist.printlist();
		llist.swapNode(12, 16);
		System.out.println("After swap");
		llist.printlist();
	}

	private void swapNode(int x, int y) {
		
		Node prevX = null, currX = head; 
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}
		Node prevY = null, currY = head;
		while(currY != null && currY.data != y ) {
			prevY = currY;
			currY = currY.next;
		}
		if(currX == null || currY == null) {
			return;
		}
		
		prevX.next = currY;
		Node temp = currY.next;
		currY.next = currX.next;
		prevY.next = currX;
		currX.next = temp;

	}

	private void printlist() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

}
