package com.datastructure.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

import com.doublyLinkedList1.DLL;

public class BSTToDLL {

	Node head;

	public static void main(String[] args) {
		BSTToDLL bst = new BSTToDLL();
		Node root = null;
		root = bst.add(root, 8);
		root = bst.add(root, 3);
		root = bst.add(root, 6);
		root = bst.add(root, 10);
		root = bst.add(root, 4);
		root = bst.add(root, 7);
		root = bst.add(root, 1);
		root = bst.add(root, 14);
		root = bst.add(root, 13);
		bst.inOrder(root);
		System.out.println();
		bst.bstToDll(root);
		bst.dllTraverse();

	}

	private void dllTraverse() {
		Node temp = head;
		if (head == null)
			return;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.right;
		}
	}

	private void bstToDll(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node p = q.remove();
			createDLL(p.data);
			if (p.left != null)
				q.add(p.left);
			if (p.right != null)
				q.add(p.right);
		}
	}

	private void createDLL(int data) {
		Node node = new Node(data);
		Node temp = head;
		if (temp == null) {
			head = node;
		} else {
			while (temp.right != null) {
				temp = temp.right;
			}
			temp.right = node;
			node.left = temp;
		}
	}

	private Node add(Node root, int data) {

		if (root == null) {
			return new Node(data);
		} else if (data < root.data) {
			root.left = add(root.left, data);
		} else if (data > root.data) {
			root.right = add(root.right, data);
		}
		return root;
	}

	private void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
}
