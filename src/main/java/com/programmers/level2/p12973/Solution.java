package com.programmers.level2.p12973;

import java.util.Stack;

class Solution {
	public static int solution(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty()) {
				stack.add(s.charAt(i));
			} else {
				char a = stack.peek();
				stack.add(s.charAt(i));
				if (a == stack.peek()) {
					stack.pop();
					stack.pop();
				}
			}
		}
		if (stack.isEmpty())
			return 1;
		return 0;
	}
}