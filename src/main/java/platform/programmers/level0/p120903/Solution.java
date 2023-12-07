package platform.programmers.level0.p120903;

import java.util.Objects;

class Main {
	public static void main(String[] args) {
	}
}

class Solution {
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		for (String s : s1) {
			for (String ss : s2) {
				if (Objects.equals(s, ss))
					answer++;
			}
		}
		return answer;
	}
}