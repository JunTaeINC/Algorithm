package com.programmers.level2.p42746;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {

	public static String solution(int[] numbers) {
		String[] arr = IntStream.of(numbers)
			.mapToObj(String::valueOf)
			.toArray(String[]::new);

		Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

		if (arr[0].equals("0")) {
			return "0";
		}

		return String.join("", arr);
	}
}