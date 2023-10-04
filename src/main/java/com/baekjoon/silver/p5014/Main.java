package com.baekjoon.silver.p5014;

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

        int maxFloor = Integer.parseInt(st.nextToken());
        int nowFloor = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());

        boolean[] isVisited = new boolean[maxFloor + 1];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{nowFloor, 0});
        isVisited[nowFloor] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowF = now[0];
            int count = now[1];

            if (nowF == target) {
                System.out.println(count);
                return;
            }

            int[] next = new int[]{nowF + up, nowF - down};

            for (int n : next) {
                if (0 < n && n <= maxFloor && !isVisited[n]) {
                    isVisited[n] = true;
                    queue.offer(new int[]{n, count + 1});
                }
            }
        }

        System.out.println("use the stairs");
    }
}