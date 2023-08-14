package com.programmers.level0.p120812;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public int solution(int[] array) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		List<Integer> answer = new ArrayList<>();
		for (int arr : array) {
			hashMap.put(arr, hashMap.getOrDefault(arr, 0) + 1);
		}
		int maxValue = hashMap.values().stream().max(Integer::compareTo).get();

		for (Map.Entry<Integer, Integer> hash : hashMap.entrySet()) {
			if (hash.getValue() == maxValue) {
				answer.add(hash.getKey());
			}
		}
		if (answer.size() == 1) {
			return answer.get(0);
		} else {
			return -1;
		}
	}
}