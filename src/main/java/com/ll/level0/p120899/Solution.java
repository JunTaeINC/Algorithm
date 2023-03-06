package com.ll.level0.p120899;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        for (int arr : array) {
            max = Math.max(arr, max);
        }
        answer[0] = max;
        for (int i = 0; i < array.length; i++) {
            if (answer[0] == array[i]) {
                answer[1] = i;
            }
        }
        return answer;
    }
}