package platform.programmers.level2.p42578;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map = new HashMap<>();

		for (String[] cloth : clothes) {
			map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
		}

		for (int v : map.values()) {
			answer *= (v + 1);
		}

		return answer - 1;
	}
}