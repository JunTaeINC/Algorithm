package platform.programmers.level0.p120838;

class Solution {
	public String solution(String letter) {
		String[] a = letter.split(" ");
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
			"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String answer = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < morse.length; j++) {
				if (a[i].equals(morse[j])) {
					answer += alpha.charAt(j);
					break;
				}
			}
		}
		return answer;
	}
}
