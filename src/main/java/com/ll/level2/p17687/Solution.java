package com.ll.level2.p17687;

class Solution {

	private String convertNumberToNBase(int num, int base) {
		return Integer.toString(num, base).toUpperCase();
	}

	public String solution(int n, int t, int m, int p) {
		StringBuilder answer = new StringBuilder();
		StringBuilder gameString = new StringBuilder();
		int num = 0;

		while (gameString.length() < t * m) {
			gameString.append(convertNumberToNBase(num++, n));
		}

		for (int i = p - 1; i < t * m; i += m) {
			answer.append(gameString.charAt(i));
		}

		return answer.toString();
	}
}