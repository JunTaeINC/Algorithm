package com.ll.level2.p138476;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : tangerine) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int[] val = map.values().stream()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int v : val) {
            if (k <= 0) break;
            k -= v;
            answer++;
        }
        return answer;
    }
}