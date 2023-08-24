package com.programmers.level2.p17679;

class Solution {
	char[][] arr;

	public int solution(int m, int n, String[] board) {
		int answer = 0;
		arr = new char[m][n];
		initBoard(m, board);

		while (true) {
			int count = simulation(m, n);

			if (count == 0) {
				break;
			}
			answer += count;
		}

		return answer;
	}

	private void initBoard(int m, String[] board) {
		for (int i = 0; i < m; i++) {
			arr[i] = board[i].toCharArray();
		}
	}

	private int simulation(int m, int n) {
		boolean[][] visited = new boolean[m][n];

		markVisitedBlocks(m, n, visited);
		int count = countSameBlockAndUpdate(m, n, visited);

		while (dropBlock(m, n)) {
		}

		return count;
	}

	private void markVisitedBlocks(int m, int n, boolean[][] visited) {
		for (int i = 0; i < m - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[i][j] != '-' && checkBlock(i, j)) {
					visited[i][j] = visited[i][j + 1] = visited[i + 1][j] = visited[i + 1][j + 1] = true;
				}
			}
		}
	}

	private boolean dropBlock(int m, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = m - 1; j > 0; j--) {
				if (arr[j - 1][i] != '-' && arr[j][i] == '-') {
					arr[j][i] = arr[j - 1][i];
					arr[j - 1][i] = '-';
					return true;
				}
			}
		}
		return false;
	}

	private int countSameBlockAndUpdate(int m, int n, boolean[][] visited) {
		int count = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j]) {
					count += 1;
					arr[i][j] = '-';
				}
			}
		}
		return count;
	}

	private boolean checkBlock(int m, int n) {
		char target = arr[m][n];
		return target == arr[m + 1][n] && target == arr[m + 1][n + 1] && target == arr[m][n + 1];
	}
}