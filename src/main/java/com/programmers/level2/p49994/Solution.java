package com.programmers.level2.p49994;

import java.util.HashSet;

class Solution {
	public int solution(String dirs) {
		HashSet<String> answer = new HashSet<>();

		int x = 0;
		int y = 0;

		for (char dir : dirs.toCharArray()) {
			int nextX = x;
			int nextY = y;
			String str = "";

			if (dir == 'U') {
				nextY++;
				str += x;
				str += y;
				str += nextX;
				str += nextY;
			} else if (dir == 'D') {
				nextY--;
				str += nextX;
				str += nextY;
				str += x;
				str += y;
			} else if (dir == 'R') {
				nextX++;
				str += x;
				str += y;
				str += nextX;
				str += nextY;
			} else {
				nextX--;
				str += nextX;
				str += nextY;
				str += x;
				str += y;
			}

			if (nextX < -5 || nextX > 5 || nextY < -5 || nextY > 5) continue;

			x = nextX;
			y = nextY;
			answer.add(str);
		}

		return answer.size();
	}
}