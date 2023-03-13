package com.ll.level0.p120902;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        if (my_string.contains(" - ")) my_string = my_string.replaceAll("- ", "+ -");
        String[] strArr = my_string.split(" \\+ ");
        for (String str : strArr) {
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}