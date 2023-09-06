package com.baekjoon.silver.p9095;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();

		int[] dp = new int[12];

		dp[0] = dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= 11; i++) {
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}

		for (int i = 0; i < N; i++) {
			sb.append(dp[sc.nextInt()]).append("\n");
		}

		System.out.println(sb);
		sc.close();
	}
}