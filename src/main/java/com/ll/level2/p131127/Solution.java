package com.ll.level2.p131127;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public static int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < want.length; i++) {
			map.put(want[i], number[i]);
		}

		for (int i = 0; i <= discount.length - 10; i++) {
			Map<String, Integer> _map = new HashMap<>();

			for (int j = i; j < 10 + i; j++) {
				_map.put(discount[j], _map.getOrDefault(discount[j], 0) + 1);
			}

			boolean isTrue = true;
			for (String key : map.keySet()) {
				if (map.get(key) > _map.getOrDefault(key, 0)) {
					isTrue = false;
					break;
				}
			}
			if (isTrue) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] a = new String[] {"banana", "apple", "rice", "pork", "pot"};
		int[] b = new int[] {3, 2, 2, 2, 1};
		String[] c = new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork",
			"rice", "pot", "banana", "apple", "banana"};

		System.out.println(solution(a, b, c));
	}
}