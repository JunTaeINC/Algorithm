package platform.programmers.level2.p86971;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    int answer;
    int[][] lines;

    public int solution(int n, int[][] wires) {
        answer = Integer.MAX_VALUE;
        lines = new int[n][n];

        for (int[] w : wires) {
            int start = w[0] - 1, end = w[1] - 1;

            lines[start][end] = 1;
            lines[end][start] = 1;
        }

        for (int[] w : wires) {
            int start = w[0] - 1, end = w[1] - 1;

            lines[start][end] = 0;
            lines[end][start] = 0;

            bfs(n, start);

            lines[start][end] = 1;
            lines[end][start] = 1;
        }

        return answer;
    }

    private void bfs(int n, int start) {
        int count = 1;
        boolean[] isVisited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        isVisited[start] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int from = queue.poll();

            for (int i = 0; i < n; i++) {
                if (lines[from][i] == 1 && !isVisited[i]) {
                    count++;
                    isVisited[i] = true;
                    queue.offer(i);
                }
            }
        }

        answer = Math.min(answer, Math.abs(count - (n - count)));
    }
}