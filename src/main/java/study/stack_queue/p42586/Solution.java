package study.stack_queue.p42586;

import java.util.*;

class Solution {

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        // queue에 작업일 넣기
        for (int i = 0; i < progresses.length; i++) {
            int num = 100 - progresses[i];
            int q;
            if (num % speeds[i] == 0) {
                q = num / speeds[i];
            } else {
                q = (num / speeds[i]) + 1;
            }
            queue.add(q);
        }
        while (!queue.isEmpty()) {
            int index = queue.poll();
            int count = 1;
            while (!queue.isEmpty() && index >= queue.peek()) {
                count++;
                queue.poll();
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}