package com.ll.level1.p42889;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Float> fail = new HashMap<>();

        int length = stages.length;

        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int stage : stages) {
                if (i == stage) count++;
            }
            if (count == 0) {
                fail.put(i, 0f);
                continue;
            }
            fail.put(i, (float) count / length);
            length -= count;
        }
        return fail.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
