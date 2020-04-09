package com.stackDemo;

public class BalancedParnthesis {

	public static void main(String[] args) {
		char[] arr = { '{', '(', 'a', '_', ')', '[', ']', '}', '4', '[', ']' };

		if (isBalanced(arr))
			System.out.println("Balance");
		else
			System.out.println("Not Balanced");

	}

	private static boolean isBalanced(char[] arr) {

		StackCharacter s = new StackCharacter();
		for (char c : arr) {
			if (c == '(' || c == '{' || c == '[') {
				s.push(c);
			}
			if (c == ')' || c == '}' || c == ']') {
				if (s.isEmpty()) {
					return false;
				}
				if (!isMatchingPair(s.pop(), c)) {
					return false;
				}

			}
		}
		if (s.isEmpty()) {
			return true;
		} else
			return false;

	}

	private static boolean isMatchingPair(char pop, char c) {
		if (pop == '(' && c == ')')
			return true;
		else if (pop == '{' && c == '}')
			return true;
		else if (pop == '[' && c == ']')
			return true;
		return false;
	}

}
