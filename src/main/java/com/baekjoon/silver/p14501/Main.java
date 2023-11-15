package com.baekjoon.silver.p14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        int[] day = new int[N];
        int[] price = new int[N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            day[i] = Integer.parseInt(st.nextToken());
            price[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < N ; i++) {
            if(i + day[i] <= N) {
                dp[i + day[i]] = Math.max(dp[i + day[i]], dp[i] + price[i]);
            }

            dp[i + 1] = Math.max(dp[i], dp[i+1]);
        }

        System.out.println(dp[N]);
    }
}