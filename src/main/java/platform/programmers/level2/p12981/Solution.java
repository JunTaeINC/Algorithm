package platform.programmers.level2.p12981;

import java.util.Stack;

class Solution {
	public static int[] solution(int n, String[] words) {
		int count = 0;

		Stack<String> strings = new Stack<>();
		strings.push(words[0]);
		for (int i = 1; i < words.length; i++) {
			char lastIndex = strings.peek().charAt(strings.peek().length() - 1);
			if (lastIndex != words[i].charAt(0) || strings.contains(words[i])) {
				return new int[] {(i % n) + 1, (i / n) + 1};
			} else {
				strings.push(words[i]);
			}
		}
		return new int[2];
	}
}