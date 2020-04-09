package com.doublyLinkedList1;

public class DLL {
	Node root;

	static class Node {
		int data;
		Node prev;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	public static void main(String[] args) {
		DLL d = new DLL();
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);
		d.add(7);
		d.add(8);
		d.traverse();
		d.reverse();
		System.out.println();
		d.traverse();
	}

	private void reverse() {
		Node curr = root;
		while (curr != null) {
			Node cn = curr.next;
			Node temp = curr.prev;
			curr.prev = curr.next;
			curr.next = temp;
			root = curr;
			curr = cn;
		}
	}

	private void add(int i) {
		Node node = new Node(i);
		Node temp = root;
		if (temp == null) {
			root = node;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.prev = temp;
		}
	}

	private void traverse() {
		Node temp = root;
		if (temp == null)
			return;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}
