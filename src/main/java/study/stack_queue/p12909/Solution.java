package study.stack_queue.p12909;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
        Queue<String> queue = new LinkedList<>();

        // 다 쪼개기
        char[] chars = s.toCharArray();
        // ")" 일시 지울게 없어 바로 false;
        if (chars[0] == ')') return false;
        for (char cha : chars) {
            // str == (
            if (cha == '(') {
                queue.add("(");
                // str == )
            } else {
                if (queue.isEmpty() || queue.peek().equals(")")) {
                    return false;
                } else {
                    queue.remove();
                }
            }
        }
        return queue.isEmpty();
    }
}