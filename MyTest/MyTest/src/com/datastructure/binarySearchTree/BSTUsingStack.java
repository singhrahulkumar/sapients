package com.datastructure.binarySearchTree;

import java.util.Stack;

public class BSTUsingStack {

	public static void main(String[] args) {

		BSTUsingStack bst = new BSTUsingStack();
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
		System.out.println("Inorder traversal using iteration");
		bst.inOrder(root);
		System.out.println();
		System.out.println("Preorder traversal using iteration");
		bst.preOrder(root);

	}

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

	private void preOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		while (true) {

			while (root != null) {
				System.out.print(root.data + " ");
				stack.push(root);
				root = root.left;

			}
			if (stack.isEmpty())
				break;
			Node temp = stack.pop();
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
