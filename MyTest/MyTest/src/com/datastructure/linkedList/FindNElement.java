package com.datastructure.linkedList;

import com.datastructure.linkedList.DeletionOfNode.Node;

public class FindNElement {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		FindNElement llist = new FindNElement();
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		llist.add(5);
		llist.add(6);
		llist.add(7);
		llist.printlist();
		int index = llist.findNIndex(3);
		System.out.println("Index " + index);
		Node n = llist.fromEnd(3);
		System.out.println("node :" + n.data);
		Node n1 = llist.fromEndUsing2Pointer(3);
		System.out.println(n1.data);

	}

	private Node fromEndUsing2Pointer(int f) {

		Node sp = head;
		Node fp = head;
		Node r = head;
		for (int i = 1; i < f; i++) {
			fp = fp.next;
		}
		while (fp.next != null) {
			sp = sp.next;
			fp = fp.next;
		}
		return sp;
	}

	private Node fromEnd(int i) {
		Node n = head;
		Node r = head;
		int count = 0;
		while (n != null) {
			count++;
			n = n.next;
		}
		int index = count - i + 1;

		Node m = head;
		int k = 0;
		while (m != null) {
			k++;
			if (k == index) {
				r = m;
				break;
			}
			m = m.next;
		}

		return r;
	}

	private int findNIndex(int i) {
		Node n = head;
		int count = 0;
		while (n != null) {
			count++;
			if (n.data == i)
				break;
			n = n.next;
		}
		return count;

	}

	private void printlist() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	private void add(int i) {
		Node node = new Node(i);
		if (head == null) {
			head = node;
			return;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			return;
		}
	}

}
