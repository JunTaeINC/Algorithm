package com.programmers.level2.p12939;

import java.util.Arrays;

class Solution {
	public String solution(String s) {
		int[] arr = Arrays.stream(s.split(" "))
			.mapToInt(Integer::parseInt)
			.sorted()
			.toArray();
		return String.format("%s %s", arr[0], arr[arr.length - 1]);
	}
}