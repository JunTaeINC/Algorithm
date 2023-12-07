package platform.programmers.level1.p161989;

class Solution {
	public static int solution(int n, int m, int[] section) {
		int answer = 1;
		int start = section[0];
		int end = start + m;

		for (int sec : section) {
			if (start <= sec && sec < end)
				continue;

			start = sec;
			end = start + m;
			answer++;

		}
		return answer;
	}

}