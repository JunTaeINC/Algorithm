package com.ll.level2.p76502;

import java.util.Stack;

class Solution {
    public int solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if (getValidParenthesesString(s)) count++;
        }

        return count;
    }

    private boolean getValidParenthesesString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char cha : str.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(cha);
            } else if (cha == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (cha == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (cha == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(cha);
            }
        }
        return stack.isEmpty();
    }
}