package com.ll.level1.p142086;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (!str.contains(s.charAt(i) + "")) {
                answer[i] = -1;
            } else {
                answer[i] = i - str.lastIndexOf(s.charAt(i));
            }
            str += s.charAt(i) + "";
        }
        return answer;
    }
}