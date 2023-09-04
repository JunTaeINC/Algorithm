package com.baekjoon.silver.p1463;

import java.util.Scanner;

public class Main {
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		solution(input, 0);

		System.out.println(ans);
	}

	private static void solution(int num, int cnt) {
		if (num == 1) {
			ans = Math.min(ans, cnt);
			return;
		}

		if (cnt >= ans) {
			return;
		}

		if (num % 3 == 0) {
			solution(num / 3, cnt + 1);
		}

		if (num % 2 == 0) {
			solution(num / 2, cnt + 1);
		}

		solution(num - 1, cnt + 1);
	}

	private static int solution_V2(int num) {
		int[] dp = new int[num + 1];
		dp[0] = dp[1] = 0;

		for (int i = 2; i <= num; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0)	dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			if (i % 3 == 0)	dp[i] = Math.min(dp[i], dp[i / 3] + 1);
		}

		return dp[num];
	}
}