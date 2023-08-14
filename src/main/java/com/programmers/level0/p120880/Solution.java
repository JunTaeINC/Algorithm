package com.programmers.level0.p120880;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
	public int[] solution(int[] numList, int n) {
		Arrays.sort(numList);
		List<Integer> answer = Arrays.stream(numList)
			.boxed()
			.sorted((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)))
			.collect(Collectors.toList());
		Collections.reverse(answer);
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

}