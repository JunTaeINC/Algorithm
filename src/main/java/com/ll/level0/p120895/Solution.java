package com.ll.level0.p120895;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] a = my_string.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (i == num1) {
                answer += a[num2] + "";
            } else if (i == num2) {
                answer += a[num1] + "";
            } else {
                answer += a[i] + "";
            }
        }
        return answer;
    }
}