package com.datastructure.binarySearchTree;

import java.util.Stack;

public class BinarySearchTreeInorderPredecessor {

	public static void main(String[] args) {

		BinarySearchTreeInorderPredecessor bst = new BinarySearchTreeInorderPredecessor();
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
		System.out.println();
		Node inOrderPred = bst.inOrderPredessor(root, 40);
		System.out.println(inOrderPred.data);
		Node inOrderPredWithoutLeft = bst.inOrderPredessor(root, 79);
		System.out.println(inOrderPredWithoutLeft.data);

	}

	private Node inOrderPredessor(Node root, int data) {
		Node r = findNode(root, data);
		if (r.left != null) {
			r = r.left;
			while (r.right != null) {
				r = r.right;
			}
		} else if (r.left == null) {
			while (root.data != data) {
				if (data > root.data) {
					r = root;
					root = root.right;
				} else {
					root = root.left;
				}
			}
		}
		return r;
	}

	private Node findNode(Node root, int data) {

		if (root.data == data) {
			return root;
		} else if (data < root.data) {
			return findNode(root.left, data);
		} else if (data > root.data) {
			return findNode(root.right, data);
		}
		return root;
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

}
