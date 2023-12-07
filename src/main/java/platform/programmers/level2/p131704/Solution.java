package platform.programmers.level2.p131704;

import java.util.Stack;

class Solution {
	public static int solution(int[] order) {
		int answer = 0;
		int box = 1;

		Stack<Integer> assistance = new Stack<>();

		for (int o : order) {
			while (box <= order.length) {
				if (o == box) {
					break;
				} else if (!assistance.isEmpty() && assistance.peek() == o) {
					break;
				} else {
					assistance.push(box);
					box++;
				}
			}

			if (o == box) {
				box++;
				answer++;
			} else if (!assistance.isEmpty() && assistance.peek() == o) {
				assistance.pop();
				answer++;
			} else {
				break;
			}
		}

		return answer;
	}
}