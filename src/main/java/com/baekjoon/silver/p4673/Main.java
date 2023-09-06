package com.baekjoon.silver.p4673;

public class Main {
	private static final int MAX_LENGTH = 10_001;

	public static void main(String[] args) {
		boolean[] dp = new boolean[MAX_LENGTH];

		for (int i = 1; i < MAX_LENGTH; i++) {
			int constructor = getConstructor(i);

			if (constructor < MAX_LENGTH) {
				dp[constructor] = true;
			}
		}

		for (int i = 1; i < MAX_LENGTH; i++) {
			if (!dp[i]) {
				System.out.println(i);
			}
		}
	}

	private static int getConstructor(int i) {
		int sum = i;
		while (i != 0) {
			sum += i % 10;
			i /= 10;
		}

		return sum;
	}
}