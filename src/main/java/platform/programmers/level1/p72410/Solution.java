package platform.programmers.level1.p72410;

class Solution {
	public String solution(String new_id) {
		String answer = "";
		// 1단계
		String one = new_id.toLowerCase();

		// 2단계
		String two = "";
		for (char cha : one.toCharArray()) {
			if (('a' <= cha && cha <= 'z') || ('0' <= cha && cha <= '9') || cha == '-' || cha == '_' || cha == '.') {
				two += cha;
			}
		}

		// 3단계
		String str = two.replace("..", ".");
		while (str.contains("..")) {
			str = str.replace("..", ".");
		}

		// 4단계
		if (!str.isEmpty() && str.charAt(0) == '.')
			str = str.substring(1);
		if (!str.isEmpty() && str.charAt(str.length() - 1) == '.')
			str = str.substring(0, str.length() - 1);

		// 5단계
		if (str.isEmpty())
			str = "a";

		// 6단계
		if (str.length() > 15)
			str = str.substring(0, 15);
		if (str.charAt(str.length() - 1) == '.')
			str = str.substring(0, 14);

		// 7단계
		if (str.length() <= 2) {
			while (str.length() != 3) {
				str += str.charAt(str.length() - 1);
			}
		}
		return str;
	}
}