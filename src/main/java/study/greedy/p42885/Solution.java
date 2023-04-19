package study.greedy.p42885;

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        Stack<Integer> stack = new Stack<>();
        for (int p : people) {
            stack.add(p);
        }
        while (!stack.isEmpty()) {
            if (stack.size() == 1) {
                count++;
                break;
            }
            if (stack.get(0) + stack.peek() <= limit) {
                stack.remove(0);
                stack.pop();
                count++;
            } else {
                stack.pop();
                count++;
            }
        }
        return count;
    }
}