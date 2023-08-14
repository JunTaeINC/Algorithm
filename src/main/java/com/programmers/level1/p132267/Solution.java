package com.programmers.level1.p132267;

class Solution {
	public int solution(int a, int b, int n) {
		int answer = 0;
		while (n >= a) {
			answer += (n / a) * b;
			n = (n % a) + ((n / a) * b);
		}
		return answer;
	}
}