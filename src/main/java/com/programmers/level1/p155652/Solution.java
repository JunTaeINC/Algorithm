package com.programmers.level1.p155652;

class Solution {
	public static String solution(String s, String skip, int index) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char cha = s.charAt(i);
			int count = 0;
			while (count < index) {
				cha++;
				if (cha > 122)
					cha -= 26;
				if (!skip.contains(String.valueOf(cha)))
					count++;
			}
			answer += cha;
		}
		return answer;
	}
}