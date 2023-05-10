package com.ll.level1.p135808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(score);
        int min = Integer.MAX_VALUE;
        for (int i = score.length - 1; i > -1; i--) {
            list.add(score[i]);
            min = Math.min(min, score[i]);
            if (list.size() == m) {
                answer += score[i] * m;
                list.clear();
            }
        }
        return answer;
    }
}