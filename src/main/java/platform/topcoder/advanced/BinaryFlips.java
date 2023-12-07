package platform.topcoder.advanced;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryFlips {

    public static int solution(int A, int B, int K) {
        if (A == 0) return 0;
        if (A + B < K) return -1;

        int[] tempArr = new int[A + B + 1];
        Arrays.fill(tempArr, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(A);
        tempArr[A] = 0;

        while (!queue.isEmpty()) {
            int q = queue.poll();

            for (int i = Math.max(0, K - (A + B - q)); i <= Math.min(K, q); i++) {
                int next = q + (K - 2 * i);
                if (tempArr[next] == -1) {
                    if (next == 0) return tempArr[q] + 1;
                    tempArr[next] = tempArr[q] + 1;
                    queue.offer(next);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // test case 1 : return 4
        System.out.println(solution(4, 0, 3));

        // test case 3 : return -1
        System.out.println(solution(3, 2, 5));

        // test case 4 : return 174
        System.out.println(solution(100000, 100000, 578));

        // test case 5 : return -1
        System.out.println(solution(4, 44, 50));
    }
}