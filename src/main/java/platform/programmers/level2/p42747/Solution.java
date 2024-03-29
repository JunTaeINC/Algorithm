package platform.programmers.level2.p42747;

import java.util.Arrays;

class Solution {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			int h = citations.length - i;
			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}
		return answer;
	}

	public int solution_V2(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			int h = citations.length - i;
			int min = Math.min(citations[i], h);
			answer = Math.max(answer, min);
		}

		return answer;
	}
}