package platform.programmers.level1.p64061;

import java.util.Stack;

class Solution {
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int move : moves) {
			int number = 0;
			for (int i = 0; i < board[0].length; i++) {
				if (board[i][move - 1] != 0) {
					number = board[i][move - 1];
					board[i][move - 1] = 0;
					break;
				}
			}
			if (!stack.isEmpty() && stack.peek() == number) {
				stack.pop();
				answer += 2;
			} else {
				if (number != 0)
					stack.push(number);
			}
		}
		return answer;
	}
}