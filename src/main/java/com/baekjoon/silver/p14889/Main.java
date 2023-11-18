package com.baekjoon.silver.p14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static int answer = Integer.MAX_VALUE;
    static int[][] arr;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        isVisited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        dfs(0, 0);

        System.out.println(answer);
    }

    private static void dfs(int depth, int number) {
        if (depth == N / 2) {
            calc();
            return;
        }

        for (int i = number; i < N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                dfs(depth + 1, i + 1);
                isVisited[i] = false;
            }
        }
    }

    private static void calc() {
        int start = 0;
        int link = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isVisited[i] && isVisited[j]) {
                    start += arr[i][j];
                    start += arr[j][i];
                } else if (!isVisited[i] && !isVisited[j]) {
                    link += arr[i][j];
                    link += arr[j][i];
                }
            }
        }

        int diff = Math.abs(start - link);
        if (diff == 0) {
            System.out.println(0);
            System.exit(0);
        }

        answer = Math.min(answer, diff);
    }
}