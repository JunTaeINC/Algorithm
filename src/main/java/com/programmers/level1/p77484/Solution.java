package com.programmers.level1.p77484;

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int zero = 0;
		int sameNumberCount = 0;
		for (int lotto : lottos) {
			if (lotto == 0)
				zero++;
			for (int i = 0; i < lottos.length; i++) {
				if (lotto == win_nums[i]) {
					sameNumberCount++;
					break;
				}
			}
		}
		answer[0] = lottoRank(zero + sameNumberCount);
		answer[1] = lottoRank(sameNumberCount);

		return answer;
	}

	int lottoRank(int sameNumber) {
		return switch (sameNumber) {
			case 6 -> 1;
			case 5 -> 2;
			case 4 -> 3;
			case 3 -> 4;
			case 2 -> 5;
			default -> 6;
		};
	}
}