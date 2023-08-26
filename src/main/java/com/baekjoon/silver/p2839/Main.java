package com.baekjoon.silver.p2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		System.out.println(solution(N));
	}

	private static int solution(int x) {
		int count = 0;

		while (true) {
			if (x % 5 == 0) {
				count += x / 5;
				break;
			} else if (x < 0) {
				return -1;
			}

			x -= 3;
			count++;
		}
		return count;
	}
}