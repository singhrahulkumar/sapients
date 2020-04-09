package com.datastructure.linkedList;

import com.datastructure.linkedList.LinkedList.Node;

public class LengthOfLinkList {

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
		
		LengthOfLinkList llist = new LengthOfLinkList();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		llist.printList();
		
	}
	
	public void printList() {
		Node n = head;
		int count = 0;
		while (n != null) {
			count++;
			System.out.println(n.data + " ");
			n = n.next;
		}
		System.out.println("========");
		System.out.println(count);
	}

}
