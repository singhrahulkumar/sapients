package com.datastructure.binarySearchTree;

import java.util.Stack;

public class ZigZagTraversal {

	public static void main(String[] args) {
		ZigZagTraversal bst = new ZigZagTraversal();
		Node root = null;
		root = bst.add(root, 50);
		root = bst.add(root, 16);
		root = bst.add(root, 14);
		root = bst.add(root, 10);
		root = bst.add(root, 5);
		root = bst.add(root, 15);
		root = bst.add(root, 40);
		root = bst.add(root, 35);
		root = bst.add(root, 32);
		root = bst.add(root, 36);
		root = bst.add(root, 37);
		root = bst.add(root, 90);
		root = bst.add(root, 78);
		root = bst.add(root, 75);
		root = bst.add(root, 100);
		root = bst.add(root, 82);
		root = bst.add(root, 81);
		root = bst.add(root, 79);
		root = bst.add(root, 85);
		root = bst.add(root, 87);

		System.out.println("Inorder traversal using iteration");
		bst.inOrder(root);
		System.out.println("ZigZag traversal");
		bst.zigzagTraversal(root);
	}

	private void zigzagTraversal(Node root) {
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				Node n = s1.pop();
				System.out.print(n.data + " ");
				if (n.left != null) {
					s2.push(n.left);
				}
				if (n.right != null) {
					s2.push(n.right);
				}
			}
			while (!s2.isEmpty()) {
				Node n = s2.pop();
				System.out.print(n.data + " ");
				if (n.right != null) {
					s1.push(n.right);
				}
				if (n.left != null) {
					s1.push(n.left);
				}
			}
		}
	}

//sahana
	private void inOrder(Node root) {

		Stack<Node> stack = new Stack<Node>();
		while (true) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			if (stack.isEmpty())
				break;
			Node temp = stack.pop();
			System.out.print(temp.data + " ");
			root = temp.right;
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

}
