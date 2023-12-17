package platform.lecture.step_2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class P_1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{-4, -1, 0, 3, 10}))); // [0, 1, 9, 16, 100]
        System.out.println(Arrays.toString(solution(new int[]{-7, -3, 2, 3, 11}))); // [4, 9, 9, 49, 121]
    }

    private static int[] solution(int[] numbers) {
        Queue<Integer> queue = new PriorityQueue<>();

        for (int n : numbers) {
            queue.add(n * n);
        }

        int[] answer = new int[numbers.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }
}