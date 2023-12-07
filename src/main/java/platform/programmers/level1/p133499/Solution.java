package platform.programmers.level1.p133499;

class Solution {
	public static int solution(String[] babbling) {
		int answer = 0;

		for (String ba : babbling) {
			if (ba.contains("ayaaya") || ba.contains("yeye") || ba.contains("woowoo") || ba.contains("mama"))
				continue;

			ba = ba.replace("aya", " ");
			ba = ba.replace("ye", " ");
			ba = ba.replace("woo", " ");
			ba = ba.replace("ma", " ");
			ba = ba.replace(" ", "");

			if (ba.isEmpty())
				answer++;
		}
		return answer;
	}
}