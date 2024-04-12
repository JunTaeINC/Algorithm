package platform.programmers.level2.p118667;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long totalSum = 0, sumQueue1 = 0;
        Queue<Integer> queue_1 = new LinkedList<>();
        Queue<Integer> queue_2 = new LinkedList<>();

        for (int i = 0; i < queue1.length; i++) {
            totalSum += (queue1[i] + queue2[i]);
            sumQueue1 += queue1[i];
            queue_1.add(queue1[i]);
            queue_2.add(queue2[i]);
        }

        long target = totalSum / 2;

        while (sumQueue1 != target) {
            if (answer > (queue1.length + queue2.length) * 2) return -1;
            else if (sumQueue1 > target) {
                sumQueue1 -= queue_1.peek();
                queue_2.add(queue_1.poll());
            } else {
                sumQueue1 += queue_2.peek();
                queue_1.add(queue_2.poll());
            }

            answer++;
        }

        return answer;
    }
}