package com.programmers.level0.p120887;

class Solution {
	public int solution(int i, int j, int k) {
		int count = 0;
		for (int z = i; z <= j; z++) {
			String[] s = String.valueOf(z).split("");
			for (int b = 0; b < s.length; b++) {
				if (s[b].equals(String.valueOf(k))) {
					count++;
				}
			}
		}
		return count;
	}
}
