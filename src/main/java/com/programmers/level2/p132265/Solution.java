package com.programmers.level2.p132265;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
	public static int solution(int[] topping) {
		int answer = 0;
		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int t : topping) {
			map.put(t, map.getOrDefault(t, 0) + 1);
		}

		for (int t : topping) {
			map.put(t, map.get(t) - 1);
			set.add(t);
			if (map.get(t) == 0) map.remove(t);
			if (map.size() == set.size()) answer++;
		}

		return answer;
	}
}