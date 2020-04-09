package com.datastructure.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	public static void main(String[] args) {
		Node root = null;
		root = add(root, 8);
		root = add(root, 3);
		root = add(root, 6);
		root = add(root, 10);
		root = add(root, 4);
		root = add(root, 7);
		root = add(root, 1);
		root = add(root, 14);
		root = add(root, 13);

		/*
		 * root = delete(root, 1); root = delete(root, 14);
		 */

		inorder(root);
		System.out.println();
		System.out.println("--------------------------------------");
		preorder(root);
		levelOrderTraversal(root);
		System.out.println("--------------------");
		leftViewOfTree(root);
		System.out.println("--------------------");
		rightViewOfTree(root);
		System.out.println();
		int sum = add(root);
		System.out.println(sum);
	}

	private static int add(Node root) {
		
		if (root == null)
			return 0;
		int sum = root.data + add(root.left) + add(root.right);
		return sum;
	}

	private static void rightViewOfTree(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			int i = 0;
			while (i++ < size) {
				Node p = q.remove();
				if (i == 1)
					System.out.print(p.data + " ");
				if (p.right != null)
					q.add(p.right);
				if (p.left != null) {
					q.add(p.left);
				}
			}
		}
	}

	private static void leftViewOfTree(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			int size = q.size();
			int i = 0;
			while (i++ < size) {
				Node p = q.remove();
				if (i == 1)
					System.out.print(p.data + " ");
				if (p.left != null)
					q.add(p.left);
				if (p.right != null)
					q.add(p.right);
			}
		}
	}

	private static void levelOrderTraversal(Node root) {
		System.out.println();
		System.out.println("-----------------------------");
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		Node store = root;
		while (true) {
			Node p = q.remove();
			if (p != null) {
				store = p;
				System.out.print(p.data + " ");
				if (p.left != null)
					q.add(p.left);
				if (p.right != null)
					q.add(p.right);
			} else {
				if (store == null)
					break;
				store = p;
				System.out.println();
				q.add(null);
			}
		}
	}

	private static void inorder(Node root) {

		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	private static void preorder(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);

	}

	private static Node delete(Node node, int val) {

		if (node == null)
			return null;

		if (val < node.data) {
			node.left = delete(node.left, val);
		} else if (val > node.data) {
			node.right = delete(node.right, val);
		} else {
			if (node.left == null || node.right == null) {
				Node temp = null;
				temp = node.left == null ? node.right : node.left;
				if (temp == null) {
					return null;
				} else
					return node;
			} else {
				Node successor = getSuccessor(node);
				node.data = successor.data;
				node.right = delete(node.right, successor.data);
			}
		}
		return node;

	}

	private static Node getSuccessor(Node node) {

		if (node == null)
			return null;

		Node temp = node.right;

		while (temp.left != null)
			temp = temp.left;

		return temp;
	}

	private static Node add(Node node, int data) {

		if (node == null) {
			return new Node(data);
		} else if (data < node.data) {
			node.left = add(node.left, data);
		} else if (data > node.data) {
			node.right = add(node.right, data);
		}
		return node;
	}

}
