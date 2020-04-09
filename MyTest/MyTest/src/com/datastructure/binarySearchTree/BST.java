package com.datastructure.binarySearchTree;

public class BST {

	public static void main(String[] args) {

		BST bst = new BST();
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
		bst.preOrder(root);

	}

	private void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	private void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
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
