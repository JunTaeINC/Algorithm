package com.baekjoon.silver.p2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[][] map;
	static boolean[][] isVisited;
	private final static int[] dx = new int[] {1, 0, -1, 0};
	private final static int[] dy = new int[] {0, 1, 0, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		isVisited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String board = br.readLine();
			for (int j = 0; j < M; j++) {
				String[] boardArr = board.split("");
				map[i][j] = (boardArr[j].equals("1") ? 1 : 0);
			}
		}

		System.out.println(bfs(0, 0));
	}

	private static int bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<>();

		isVisited[x][y] = true;
		queue.offer(new int[] {x, y});

		while (!queue.isEmpty()) {
			int[] q = queue.poll();
			int nowX = q[0];
			int nowY = q[1];

			for (int i = 0; i < 4; i++) {
				int nx = nowX + dx[i];
				int ny = nowY + dy[i];
				if (isValid(nx, ny) && !isVisited[nx][ny] && map[nx][ny] == 1) {
					queue.offer(new int[] {nx, ny});
					isVisited[nx][ny] = true;
					map[nx][ny] = map[nowX][nowY] + 1;
				}
			}
		}
		return map[N - 1][M - 1];
	}

	private static boolean isValid(int x, int y) {
		return 0 <= x && x < N && 0 <= y && y < M;
	}
}