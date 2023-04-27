package com.ll.level1.p134240;

class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            answer.append((i + "").repeat(food[i] / 2));
        }
        String ans = answer.toString();
        StringBuilder player2 = answer.reverse();

        return ans + "0" + player2.toString();
    }

}