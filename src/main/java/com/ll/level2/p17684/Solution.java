package com.ll.level2.p17684;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public static int[] solution(String msg) {
		Map<String, Integer> map = new HashMap<>();
		List<Integer> answer = new ArrayList<>();

		for (char i = 'A'; i <= 'Z'; i++) {
			map.put(String.valueOf(i), i - 'A' + 1);
		}

		String str = "";
		int index = 27;
		int i = 0;
		while (i < msg.length()) {
			str += msg.charAt(i);
			i++;

			if (i == msg.length() || !map.containsKey(str + msg.charAt(i))) {
				answer.add(map.get(str));
				map.put(str + (i < msg.length() ? String.valueOf(msg.charAt(i)) : ""), index++);
				str = "";
			}
		}

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}