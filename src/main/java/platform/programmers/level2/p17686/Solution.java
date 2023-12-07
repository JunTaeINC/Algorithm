package platform.programmers.level2.p17686;

import java.util.Arrays;

class Solution {
	public String[] solution(String[] files) {
		Arrays.sort(files, (s1, s2) -> {
			String head1 = s1.split("[0-9]")[0].toLowerCase();
			String head2 = s2.split("[0-9]")[0].toLowerCase();
			if (head1.compareTo(head2) == 0) {
				String tail1 = s1.substring(head1.length());
				String tail2 = s2.substring(head2.length());
				return getNumber(tail1) - getNumber(tail2);
			} else {
				return head1.compareTo(head2);
			}
		});

		return files;
	}

	private int getNumber(String str) {
		StringBuilder result = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c) && result.length() < 6) {
				result.append(c);
			} else {
				break;
			}
		}

		return Integer.parseInt(result.toString());
	}
}