package com.stackDemo;

public class Stack {

	static final int MAX = 10;
	int top;
	int a[] = new int[MAX];// 999 value can be inserted a[0] will be {a[0]=0}

	Stack() {
		top = -1;
	}

	public static void main(String[] args) {

		Stack s = new Stack();
		for (int i = 1; i <= 12; i++) {
			s.push(i);
		}
		System.out.println("-------------------------------------------------------");
		int peek = s.peek();
		System.out.println("Peek element " + peek);
		System.out.println("-------------------------------------------------------");
		for (int i = 1; i <= 12; i++) {
			int pop = s.pop();
			System.out.println("Popped element " + pop);
		}

	}

	private boolean push(int i) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack overflow");
			return false;
		} else {
			a[++top] = i;
			System.out.println("Value pushed into stack " + i);
			return true;
		}
	}

	private int pop() {
		if (top < 0) {
			System.out.println("Stack is empty or underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}

	private int peek() {
		if (top < 0) {
			System.out.println("Stack is empty or underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}

}
