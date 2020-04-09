package com.ds;

public class SortStack {

	Stack s = new Stack();
	Stack ts = new Stack();

	public static void main(String[] args) {
		SortStack ss = new SortStack();
		ss.s.push(8);
		ss.s.push(7);
		ss.s.push(9);
		ss.s.push(6);
		ss.s.push(11);
		ss.s.push(10);
		ss.s.push(15);
		ss.s.push(14);
		ss.sort();
		while (!ss.ts.isEmpty()) {
			System.out.println(ss.ts.pop());
		}
	}

	private void sort() {
		while (!s.isEmpty()) {
			int temp = s.pop();
			while (!ts.isEmpty() && ts.peek() > temp) {
				s.push(ts.pop());
			}
			ts.push(temp);
		}
	}

}
