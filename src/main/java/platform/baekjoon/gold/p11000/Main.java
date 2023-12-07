package platform.baekjoon.gold.p11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new PriorityQueue<>();
        int[][] temp = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            temp[i][0] = Integer.parseInt(st.nextToken());
            temp[i][1] = Integer.parseInt(st.nextToken());
        }

        // Start Time sort
        Arrays.sort(temp, ((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        }));

        // First. End Time
        queue.offer(temp[0][1]);

        for (int i = 1; i < N; i++) {
            // End Time <= Start Time
            if (queue.peek() <= temp[i][0]) {
                // Lecture Room poll
                queue.poll();
            }
            // Lecture Room offer
            queue.offer(temp[i][1]);
        }

        System.out.println(queue.size());
    }
}