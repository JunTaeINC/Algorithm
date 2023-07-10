package com.ll.level2.p12951;

class Solution {
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.trim().split(" ");
        for (String a : arr) {
            if (a.isBlank()) {
                answer.append(" ");
                continue;
            }
            answer.append(a.substring(0, 1).toUpperCase())
                  .append(a.substring(1).toLowerCase()).append(" ");
        }
        if (s.charAt(s.length() - 1) == ' ') return answer.toString();
        return answer.toString().trim();
    }
}