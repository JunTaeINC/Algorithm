package platform.programmers.level2.p12913;

class Solution {
	int solution(int[][] land) {
		int answer = 0;

		for (int i = 1; i < land.length; i++) {
			land[i][0] += getMax(land[i - 1][1], land[i - 1][2], land[i - 1][3]);
			land[i][1] += getMax(land[i - 1][0], land[i - 1][2], land[i - 1][3]);
			land[i][2] += getMax(land[i - 1][0], land[i - 1][1], land[i - 1][3]);
			land[i][3] += getMax(land[i - 1][0], land[i - 1][1], land[i - 1][2]);
		}

		for (int l : land[land.length - 1]) {
			answer = Math.max(l, answer);
		}
		return answer;
	}

	private int getMax(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);
	}
}