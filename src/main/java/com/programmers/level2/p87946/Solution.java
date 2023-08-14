package com.programmers.level2.p87946;

class Solution {
	boolean[] visited;
	int maxCount;

	public int solution(int k, int[][] dungeons) {
		visited = new boolean[dungeons.length];
		dfs(dungeons, 0, k);
		return maxCount;
	}

	private void dfs(int[][] arr, int count, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] || arr[i][0] > k)
				continue;

			visited[i] = true;
			dfs(arr, count + 1, k - arr[i][1]);
			visited[i] = false;
		}
		maxCount = Math.max(maxCount, count);
	}
}