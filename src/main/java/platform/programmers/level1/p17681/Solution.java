package platform.programmers.level1.p17681;

class Solution {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < arr1.length; i++) {
			StringBuilder ans = new StringBuilder();
			String bina1 = toBinary(arr1[i], n);
			String bina2 = toBinary(arr2[i], n);
			for (int j = 0; j < bina1.length(); j++) {
				if (bina1.charAt(j) == '0' && bina2.charAt(j) == '0') {
					ans.append(" ");
				} else {
					ans.append("#");
				}
			}
			answer[i] = ans.toString();
		}
		return answer;
	}

	static String toBinary(int number, int length) {
		String bina = Integer.toBinaryString(number);

		if (bina.length() < length) {
			bina = "0".repeat(length - bina.length()) + bina;
		}
		return bina;
	}

}
