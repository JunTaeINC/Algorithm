package platform.lecture.step_3;

import java.util.LinkedList;
import java.util.Queue;

public class P_6 {

    public static void main(String[] args) {
        // return 7
        System.out.println(solution(8, 3));
    }

    private static int solution(int people, int outNumber) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= people; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < outNumber - 1; i++) queue.offer(queue.poll());
            queue.poll();
        }

        return queue.peek();
    }
}