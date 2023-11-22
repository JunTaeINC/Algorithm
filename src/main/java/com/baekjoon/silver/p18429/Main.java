package com.baekjoon.silver.p18429;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static int count = 0;
    static int[] kits;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        kits = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        isVisited = new boolean[N];

        dfs(500, 0);

        System.out.println(count);
    }

    private static void dfs(int sum, int index) {
        if (index == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            int temp = sum - K + kits[i];
            if (!isVisited[i] && temp >= 500) {
                isVisited[i] = true;
                dfs(temp, index + 1);
                isVisited[i] = false;
            }
        }
    }
}