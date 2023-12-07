package platform.programmers.level0.p120835;

class Solution {
	static int count = 0;

	public int[] solution(int[] emergency) {
		int[] answer = new int[emergency.length];
		for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < emergency.length; j++) {
				if (emergency[i] <= emergency[j]) {
					answer[i]++;
				}
			}
		}
		return answer;
	}
}
