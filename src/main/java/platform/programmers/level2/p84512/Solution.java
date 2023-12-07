package platform.programmers.level2.p84512;

class Solution {
	public static int solution(String word) {
		int result = word.length();
		String str = "AEIOU";
		int[] arr = {781, 156, 31, 6, 1};

		for (int i = 0; i < word.length(); i++) {
			int index = str.indexOf(word.charAt(i));
			result += arr[i] * index;
		}

		return result;
	}
}