package com.baekjoon.silver.p2644;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int end;
    static int answer = -1;
    static boolean[] isVisited;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N + 1][N + 1];
        isVisited = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = map[y][x] = 1;
        }

        dfs(start, 0);
        System.out.println(answer);
    }

    private static void dfs(int now, int count) {
        if (now == end) {
            answer = count;
            return;
        }

        isVisited[now] = true;
        for (int i = 1; i <= N; i++) {
            if (!isVisited[i] && map[now][i] == 1) {
                dfs(i, count + 1);
            }
        }
    }
}