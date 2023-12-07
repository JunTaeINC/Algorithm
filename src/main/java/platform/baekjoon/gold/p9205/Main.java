package platform.baekjoon.gold.p9205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        for (int t = 0; t < testCase; t++) {
            System.out.println(bfs());
        }
    }

    private static String bfs() throws IOException {
        int N = Integer.parseInt(br.readLine());

        int[] start = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] stores = new int[N][2];
        boolean[] isVisited = new boolean[N];

        for (int i = 0; i < N; i++) {
            stores[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[] end = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];
            if (Math.abs(x - end[0]) + Math.abs(y - end[1]) <= 1000) return "happy";

            for (int i = 0; i < stores.length; i++) {
                if (!isVisited[i]) {
                    int distance = Math.abs(x - stores[i][0]) + Math.abs(y - stores[i][1]);
                    if (distance <= 1000) {
                        isVisited[i] = true;
                        queue.offer(new int[]{stores[i][0], stores[i][1]});
                    }
                }
            }
        }

        return "sad";
    }
}