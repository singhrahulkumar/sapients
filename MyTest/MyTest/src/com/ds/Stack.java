package com.ds;

public class Stack {

	final int MAX = 10;
	int[] arr = new int[MAX];
	int top = -1;


	public static void main(String[] args) {

		Stack stack = new Stack();
		for (int i = 0; i < 12; i++)
			stack.push(i);
		
		for (int i = 0; i < 12; i++)
			stack.pop();
		

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack under flow");
			return -1;
		} else
			return arr[top];
	}

	public boolean push(int data) {

		if (top >= MAX-1) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			arr[++top] = data;
			return true;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			return arr[top--];
		}
	}

	public boolean isEmpty() {
		return top == -1 ? true : false;

	}

}
