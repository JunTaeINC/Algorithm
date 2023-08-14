package com.programmers.level0.p120868;

class Solution {

	public int solution(int[] sides) {
		int max = Math.max(sides[0], sides[1]);
		int min = Math.min(sides[0], sides[1]);

		int lowL = max - min;
		int highL = max + min;

		return highL - lowL - 1;
	}
}