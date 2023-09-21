package com.topcoder.intermediate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BatchSystem {

    public static int[] solution(int[] duration, String[] user) {
        Map<String, Long> map = new HashMap<>();
        int N = duration.length;

        for (int i = 0; i < N; i++) {
            map.put(user[i], map.getOrDefault(user[i], 0L) + duration[i]);
        }

        int count = 0;
        int[] answer = new int[N];
        boolean[] done = new boolean[N];

        while (count < N) {
            String next = "";

            for (int i = 0; i < N; i++) {
                if (!done[i] && (next.equals("") || map.get(user[i]) < map.get(next))) {
                    next = user[i];
                }
            }

            for (int i = 0; i < N; i++) {
                if (user[i].equals(next)) {
                    done[i] = true;
                    answer[count++] = i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // test case 0 : return [3, 1, 2, 0]
        System.out.println(Arrays.toString(solution(new int[]{400, 100, 100, 100},
                new String[]{"D M", "S T", "S T", "M T"})));

        // test case 2 : return [2, 0, 1]
        System.out.println(Arrays.toString(solution(new int[]{100, 200, 50},
                new String[]{"HOR", "KIM", "JUN"})));
    }
}