package com.ll.level2.p42842;

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        for (int i = 3; i <= total; i++) {
            if (total % i == 0) {
                int b = total / i;
                if ((b - 2) * (i - 2) == yellow) {
                    return new int[]{b, i};
                }
            }
        }
        return new int[]{};
    }
}