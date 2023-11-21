package com.baekjoon.silver.p2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    static int N;
    static int end;
    static int[] isVisited;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        isVisited = new int[N + 1];
        map = new int[N + 1][N + 1];

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = map[y][x] = 1;
        }

        bfs(start);

        System.out.println(-1);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        isVisited[start] = 1;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            if (now == end) {
                System.out.println(isVisited[now] - 1);
                System.exit(0);
            }

            for (int i = 1; i <= N; i++) {
                if (isVisited[i] == 0 && map[now][i] == 1) {
                    isVisited[i] = isVisited[now] + 1;
                    queue.add(i);
                }
            }
        }
    }
}