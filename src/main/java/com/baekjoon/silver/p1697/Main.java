package com.baekjoon.silver.p1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        boolean[] isVisited = new boolean[100_001];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});
        isVisited[start] = true;

        while (!queue.isEmpty()) {
            int[] q = queue.poll();
            int now = q[0];
            int count = q[1];

            if (now == target) {
                System.out.println(count);
                return;
            }

            int[] next = new int[]{now + 1, now - 1, now * 2};

            for (int n : next) {
                if (0 <= n && n <= 100_000 && !isVisited[n]) {
                    isVisited[n] = true;
                    queue.offer(new int[]{n, count + 1});
                }
            }
        }
    }
}