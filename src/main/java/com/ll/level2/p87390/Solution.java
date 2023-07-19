package com.ll.level2.p87390;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];

        for (int i = 0; i < answer.length; i++) {
            long col = left % n;
            long row = left / n;

            answer[i] = Math.max((int) col, (int) row) + 1;
            left++;
        }

        return answer;
    }
}