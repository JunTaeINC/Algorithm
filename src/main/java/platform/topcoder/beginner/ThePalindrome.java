package platform.topcoder.beginner;

public class ThePalindrome {

	public static int solution(String str) {
		int answer = 0;

		for (int i = str.length(); i <= 50; i++) {
			boolean flag = true;

			for (int j = 0; j < str.length(); j++) {
				if ((i - j - 1) < str.length() && str.charAt(j) != str.charAt(i - j - 1)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				answer = i;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		// test case 2 : return 11;
		String str = "qwerty";
		System.out.println(solution(str));
	}
}