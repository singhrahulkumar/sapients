package com.stackDemo;

public class StackCharacter {

	final static int MAX = 10;
	char a[] = new char[MAX];
	int top;

	StackCharacter() {
		top = -1;
	}

	public boolean push(char x) {

		if (top >= (MAX - 1)) {
			return false;
		} else {
			a[++top] = x;
			return true;
		}
	}

	public char pop() {
		if (top < 0) {
			return 0;
		} else {
			char c = a[top--];
			return c;
		}
	}

	public char peek() {

		if (top < 0) {
			return 0;
		} else {
			return a[top];
		}
	}

	public boolean isEmpty() {
		return (top == -1) ? true : false;
	}

}
