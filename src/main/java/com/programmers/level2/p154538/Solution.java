package com.programmers.level2.p154538;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static int solution(int x, int y, int n) {
		int max = 1_000_001;
		boolean[] visited = new boolean[max];
		Queue<int[]> queue = new LinkedList<>();

		queue.offer(new int[] {x, 0});
		visited[x] = true;

		while (!queue.isEmpty()) {
			int[] currentArr = queue.poll();
			int value = currentArr[0];
			int count = currentArr[1];

			if (value == y) {
				return count;
			}

			for (int next : new int[] {value + n, value * 2, value * 3}) {
				if (next < max && !visited[next]) {
					queue.offer(new int[] {next, count + 1});
					visited[next] = true;
				}
			}
		}
		return -1;
	}
}