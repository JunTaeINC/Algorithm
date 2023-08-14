package com.programmers.level0.p120913;

class Solution {
	public String[] solution(String my_str, int n) {
		int length = 0;
		if (my_str.length() % n == 0) {
			length += my_str.length() / n;
		} else {
			length = (my_str.length() / n) + 1;
		}
		String[] ans = new String[length];
		for (int i = 0; i < length; i++) {
			int start = n * i;
			int end = 0;
			if (start + n >= my_str.length()) {
				end = my_str.length();
			} else {
				end = start + n;
			}
			ans[i] = my_str.substring(start, end);
		}
		return ans;
	}
}

