package com.ll.level2.p17684;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public static int[] solution(String msg) {
		List<Integer> answer = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();

		for (char c = 'A'; c <= 'Z'; c++) {
			map.put(String.valueOf(c), c - 'A' + 1);
		}

		int index = 27;
		int i = 0;
		String str = "";

		while (i < msg.length()) {
			str += msg.charAt(i);
			i++;
			if (i == msg.length() || !map.containsKey(str + msg.charAt(i))) {
				answer.add(map.get(str));
				if (i < msg.length()) {
					map.put(str + msg.charAt(i), index++);
				}
				str = "";
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}