package com.programmers.level0.p120892;

class Solution {
	public String solution(String cipher, int code) {
		String answer = "";
		while (true) {
			if (cipher.length() < code)
				break;
			answer += cipher.charAt(code - 1);
			cipher = cipher.substring(code);
		}
		return answer;
	}
}