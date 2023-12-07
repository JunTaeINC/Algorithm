package platform.programmers.level0.p120864;

class Solution {
	public static int solution(String my_string) {
		int answer = 0;
		String[] abc = my_string.split("[a-zA-Z]");
		for (String ab : abc) {
			if (!ab.isEmpty())
				answer += Integer.parseInt(ab);
		}
		return answer;
	}
}