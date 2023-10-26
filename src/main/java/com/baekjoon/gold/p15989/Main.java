package com.baekjoon.gold.p15989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] C = new int[N];

        int max = 0;
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            C[i] = temp;
            max = Math.max(max, temp);
        }

        int[][] dp = new int[max + 1][4];
        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][2] = 1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;
        for (int i = 4; i <= max; i++) {
            dp[i][1] = dp[i - 1][1];
            dp[i][2] = dp[i - 2][1] + dp[i - 2][2];
            dp[i][3] = dp[i - 3][1] + dp[i - 3][2] + dp[i - 3][3];
        }

        for (int k : C) {
            System.out.println(dp[k][1] + dp[k][2] + dp[k][3]);
        }
    }
}