package com.programmers.level2.p42885;

import java.util.Arrays;
import java.util.Stack;

class Solution {
	public static int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		Stack<Integer> stack = new Stack<>();
		for (int p : people) {
			stack.push(p);
		}

		while (!stack.isEmpty()) {
			if (stack.size() == 1) {
				answer++;
				break;
			} else {
				if (stack.get(0) + stack.peek() <= limit) {
					stack.remove(0);
					stack.pop();
					answer++;
				} else {
					stack.pop();
					answer++;
				}
			}
		}
		return answer;
	}
}