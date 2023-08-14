package com.programmers.level1.p81301;

import java.util.List;

class Solution {
	public int solution(String s) {
		String answer = "";
		String str = "";
		List<String> numbers = List.of("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

		String[] arr = s.split("");

		for (String a : arr) {
			if (a.matches("\\d+")) {
				answer += a;
				continue;
			}
			str += a;
			if (numbers.contains(str)) {
				answer += numbers.indexOf(str);
				str = "";
			}
		}

		return Integer.parseInt(answer);
	}

	public int solution2(String s) {

		String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

		for (int i = 0; i < numbers.length; i++) {
			s = s.replaceAll(numbers[i], String.valueOf(i));
		}

		return Integer.parseInt(s);
	}

}