package com.datastructure.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class DFS {

	public static void main(String[] args) {

		DFS bst = new DFS();
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
		bst.dfs(root);

	}

	private void dfs(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node p = q.remove();
			System.out.print(p.data + " ");
			if (p.left != null)
				q.add(p.left);
			if (p.right != null)
				q.add(p.right);
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
