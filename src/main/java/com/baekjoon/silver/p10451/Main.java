package com.baekjoon.silver.p10451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] map;
	static boolean[] isVisited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) {
			int permutationSize = Integer.parseInt(br.readLine());
			int count = 0;
			map = new int[permutationSize + 1];
			isVisited = new boolean[permutationSize + 1];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 1; j < map.length; j++) {
				map[j] = Integer.parseInt(st.nextToken());
			}

			for (int k = 1; k < map.length; k++) {
				if (!isVisited[k]) {
					dfs(k);
					count++;
				}
			}

			System.out.println(count);
		}
	}

	private static void dfs(int index) {
		isVisited[index] = true;
		int nextIndex = map[index];

		if (!isVisited[nextIndex]) {
			dfs(nextIndex);
		}
	}
}