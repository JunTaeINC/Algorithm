package com.programmers.level2.p12924;

class Solution {
	public static int solution(int n) {
		int answer = 0;
		int i = 1;
		while (i <= n) {
			int sum = 0;
			int ii = i;

			while (sum <= n) {
				sum += ii;
				if (sum == n) {
					answer++;
					break;
				}
				ii++;
			}
			i++;
		}
		return answer;
	}
}