package com.baekjoon.silver.p2579;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] st = new int[301];
        int[] dp = new int[301];

        for (int i = 0; i < N; i++) {
            st[i] = sc.nextInt();
        }

        dp[0] = st[0];
        dp[1] = st[1] + st[0];
        dp[2] = Math.max(st[0], st[1]) + st[2];

        for (int i = 3; i < N; i++) {
            dp[i] = Math.max(st[i - 1] + dp[i - 3], dp[i - 2]) + st[i];
        }

        System.out.println(dp[N - 1]);
    }
}