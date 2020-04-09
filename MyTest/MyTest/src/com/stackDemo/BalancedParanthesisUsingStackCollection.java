package com.stackDemo;

import java.util.Stack;

public class BalancedParanthesisUsingStackCollection {

	public static void main(String[] args) {

		char[] arr = { '{', '(', 'a', '_', ')', '[', ']', '}', '4', '[', ']' };

		if (isBalanced(arr))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");

	}

	private static boolean isBalanced(char[] arr) {
		
		Stack<Character> stack = new Stack<>();
		for(Character c : arr) {
			if(c == '{' || c== '(' || c== '[' ) {
				stack.push(c);
			}else if(c == '}' || c== ')' || c== ']' ) {
				if(!checkParanthesis(stack.pop(),c))
					return false;
			}
		}
		
		if(stack.isEmpty())
			return true;
		else
			return false;
	}

	private static boolean checkParanthesis(Character pop, Character c) {
		if(c == '}' && pop == '{')
			return true;
		else if (c == ')' && pop == '(')
			return true;
		else if(c == ']' && pop == '[')
			return true;
		return false;
	}

}
