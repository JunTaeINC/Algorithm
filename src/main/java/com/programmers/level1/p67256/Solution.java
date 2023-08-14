package com.programmers.level1.p67256;

class Solution {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		int left = 10;
		int right = 12;
		for (int number : numbers) {
			switch (number) {
				case 1, 4, 7 -> {
					answer += "L";
					left = number;
				}
				case 3, 6, 9 -> {
					answer += "R";
					right = number;
				}
				case 0, 2, 5, 8 -> {
					if (number == 0)
						number = 11;
					int leftDist = Math.abs(number - left) / 3 + Math.abs(number - left) % 3;
					int rightDist = Math.abs(number - right) / 3 + Math.abs(number - right) % 3;
					if (leftDist > rightDist) {
						answer += "R";
						right = number;
					} else if (leftDist < rightDist) {
						answer += "L";
						left = number;
					} else {
						if (hand.equals("left")) {
							answer += "L";
							left = number;
						} else {
							answer += "R";
							right = number;
						}
					}
				}
			}
		}
		return answer;
	}
}