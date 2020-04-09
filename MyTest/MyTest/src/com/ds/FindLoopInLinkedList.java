package com.ds;

import java.util.HashSet;
import java.util.Set;

public class FindLoopInLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int tmp) {
			data = tmp;
		}

	}

	public static void main(String[] args) {
		Node n1 = new Node(34);
		Node n2 = new Node(25);
		Node n3 = new Node(31);
		Node n4 = new Node(56);
		Node n5 = new Node(45);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n3;

		System.out.println("Is loop detected: " + identifyLoopV1(n1));
		System.out.println("Is loop detected: " + identifyLoopV2(n1));
	}

	private static Boolean identifyLoopV2(Node head) {

		Node sp = head;
		Node fp = head;
		while (sp != null && fp != null && fp.next != null) {
			sp = sp.next;
			fp = fp.next.next;
			if (sp == fp) {
				return Boolean.TRUE;
			}
		}

		return Boolean.FALSE;
	}

	private static Boolean identifyLoopV1(Node head) {

		Set<Node> set = new HashSet<>();
		while (head != null) {
			if (set.contains(head)) {
				return Boolean.TRUE;
			}
			set.add(head);
			head = head.next;
		}
		return Boolean.FALSE;
	}

}
