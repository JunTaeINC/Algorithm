package com.programmers.level2.p42584;

import java.util.Stack;

class Solution {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				answer[i]++;
				if (prices[i] > prices[j]) {
					break;
				}
			}
		}

		return answer;
	}

	public int[] solution_Stack(int[] prices) {
		int n = prices.length;
		int[] answer = new int[n];
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
				int j = stack.pop();
				answer[j] = i - j;
			}
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			int j = stack.pop();
			answer[j] = n - j - 1;
		}

		return answer;
	}
}