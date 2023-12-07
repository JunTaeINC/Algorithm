package platform.programmers.level1.p12982;

import java.util.Arrays;

class Solution {
	public int solution(int[] d, int budget) {
		int count = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			if (d[i] <= budget) {
				budget -= d[i];
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}