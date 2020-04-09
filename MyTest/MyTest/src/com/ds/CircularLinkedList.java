package com.ds;

public class CircularLinkedList {
	Node root;

	public static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {

		CircularLinkedList cl = new CircularLinkedList();
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(5);
		cl.search(3);
		cl.insertAfterGivenNode(3, 4);

		cl.traverse();
	}

	private void insertAfterGivenNode(int data, int insertData) {

		Node newNode = new Node(insertData);
		Node temp = root;
		if (temp == null)
			return;
		else {
			do {
				if (temp.data == data) {
					newNode.next = temp.next;
					temp.next = newNode;
					System.out.println("Inserted");
					break;
				}
				temp = temp.next;
			} while (temp != root);
		}

	}

	private void search(int data) {
		Node temp = root;
		int index = 0;
		do {
			if (temp.data == data) {
				System.out.println("Data at index: " + index);
				break;
			}
			index++;
			temp = temp.next;
		} while (temp != root);
	}

	private void traverse() {
		Node temp = root;
		if (temp == null)
			return;
		else {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != root);

		}

	}

	private void add(int data) {
		Node temp = root;
		Node node = new Node(data);
		if (temp == null) {
			node.next = node;
			root = node;
		} else {
			while (temp.next != root) {
				temp = temp.next;
			}
			temp.next = node;
			node.next = root;
		}

	}

}
