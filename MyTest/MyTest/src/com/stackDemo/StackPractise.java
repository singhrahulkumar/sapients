package com.stackDemo;

public class StackPractise {

	final static int MAX = 10;
	int[] stack = new int[MAX];
	int top;

	StackPractise() {
		top = -1;
	}

	public static void main(String[] args) {

		StackPractise s = new StackPractise();

		for (int i = 1; i < 12; i++) {
			s.push(i);
		}
		for (int i = 0; i < 12; i++) {
			int x = s.pop();
			System.out.print(x + " ");
		}
	}

	private int pop() {
		if (top < 0) {
			System.out.println("Stack under flow");
			return 0;
		} else {
			int x = stack[top--];
			return x;
		}
	}

	private boolean push(int i) {
		if (top >= (MAX - 1)) {
			System.out.println("System under flow");
			return false;
		} else {
			stack[++top] = i;
			return true;
		}
	}

}
