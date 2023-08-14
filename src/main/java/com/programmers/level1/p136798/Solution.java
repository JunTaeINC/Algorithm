package com.programmers.level1.p136798;

class Solution {
	public static int solution(int number, int limit, int power) {
		int answer = 0;

		for (int i = 1; i <= number; i++) {
			int divisorCount = 0;
			for (int j = 1; j * j <= i; j++) {
				if (j * j == i)
					divisorCount++;
				else if (i % j == 0)
					divisorCount += 2;
			}

			if (divisorCount <= limit) {
				answer += divisorCount;
			} else {
				answer += power;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(10, 3, 2));
	}
}