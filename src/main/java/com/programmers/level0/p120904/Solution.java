package com.programmers.level0.p120904;

class Solution {
	public int solution(int num, int k) {
		int answer = -1;
		String[] aa = String.valueOf(num).split("");
		for (int i = 0; i < aa.length; i++) {
			if (aa[i].equals(String.valueOf(k))) {
				answer = i + 1;
				break;
			}
		}
		return answer;
	}
}