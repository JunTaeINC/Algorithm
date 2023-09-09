package com.baekjoon.silver.p1065;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= N; i++) {
			if (isHanNumber(i)) {
				count++;
			}
		}

		System.out.println(count);
	}

	private static boolean isHanNumber(int number) {
		if (number < 100) {
			return true;
		} else if (number < 1000) {
			int hundreds = number / 100;
			int tens = (number % 100) / 10;
			int units = number % 10;

			return (hundreds - tens == tens - units);
		}

		return false;
	}
}