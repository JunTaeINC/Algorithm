package com.ll.level1.p150370;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        int todayDays = getDay(today);

        for (String t : terms) {
            String[] a = t.split(" ");
            map.put(a[0], Integer.parseInt(a[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] sp = privacies[i].split(" ");
            int day = getDay(sp[0]) + map.get(sp[1]) * 28;
            if (day <= todayDays) answer.add(i + 1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int getDay(String s) {
        String[] a = s.split("\\.");
        int year = Integer.parseInt(a[0]);
        int month = Integer.parseInt(a[1]);
        int day = Integer.parseInt(a[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}