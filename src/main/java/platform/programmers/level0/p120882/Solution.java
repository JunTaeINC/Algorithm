package platform.programmers.level0.p120882;

class Solution {
	public int[] solution(int[][] score) {
		int[] sum = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			sum[i] = score[i][0] + score[i][1];
		}
		int[] answer = new int[score.length];
		for (int j = 0; j < score.length; j++) {
			int order = 1;
			for (int k = 0; k < score.length; k++) {
				if (sum[j] < sum[k])
					order++;
				answer[j] = order;
			}
		}
		return answer;
	}
}