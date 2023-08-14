package com.programmers.level0.p120850;

import java.util.Arrays;

class Solution {
	public int[] solution(String my_string) {
		String a = "";
		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57)
				a += my_string.charAt(i);
		}
		int[] answer = new int[a.length()];
		for (int i = 0; i < a.length(); i++) {
			answer[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
		}
		Arrays.sort(answer);
		return answer;
	}
}