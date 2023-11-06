package com.baekjoon.gold.p13549;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        boolean[] isVisited = new boolean[100_001];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});

        int answer = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            int[] q = queue.poll();
            int now = q[0];
            int second = q[1];
            isVisited[now] = true;

            if (now == target) answer = Math.min(answer, second);

            if (now + 1 <= 100_000 && !isVisited[now + 1]) queue.offer(new int[]{now + 1, second + 1});
            if (now - 1 >= 0 && !isVisited[now - 1]) queue.offer(new int[]{now - 1, second + 1});
            if (now * 2 <= 100_000 && !isVisited[now * 2]) queue.offer(new int[]{now * 2, second});
        }

        System.out.println(answer);
    }
}