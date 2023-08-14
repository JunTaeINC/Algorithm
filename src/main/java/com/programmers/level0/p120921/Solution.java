package com.programmers.level0.p120921;

class Solution {
	public int solution(String A, String B) {
		int count = 0;
		StringBuilder a = new StringBuilder(A);

		for (int i = 0; i < A.length(); i++) {
			if (a.toString().equals(B))
				break;
			count++;
			a.insert(0, a.charAt(a.length() - 1));
			a.deleteCharAt(a.length() - 1);
		}
		if (count == A.length())
			return -1;
		return count;
	}
}