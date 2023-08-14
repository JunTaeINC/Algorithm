package com.programmers.level2.p64065;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
	public static int[] solution(String s) {
		String[] arr = s.substring(2, s.length() - 2).split("},\\{");
		Arrays.sort(arr, Comparator.comparingInt(String::length));
		Set<String> set = new LinkedHashSet<>();

		for (String aa : arr) {
			String[] a = aa.split(",");
			for (String _a : a) {
				if (_a.matches("[0-9]+")) {
					set.add(_a);
				}
			}
		}
		return set.stream().mapToInt(Integer::parseInt).toArray();
	}
}