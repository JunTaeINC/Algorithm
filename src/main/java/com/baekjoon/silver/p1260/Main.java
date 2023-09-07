package com.baekjoon.silver.p1260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int vertex;
	static int[][] dfsGraph;
	static int[][] bfsGraph;
	static boolean[] dfsVisited;
	static boolean[] bfsVisited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		vertex = sc.nextInt();
		int edge = sc.nextInt();
		int startVertex = sc.nextInt();

		dfsGraph = new int[vertex + 1][vertex + 1];
		bfsGraph = new int[vertex + 1][vertex + 1];

		dfsVisited = new boolean[vertex + 1];
		bfsVisited = new boolean[vertex + 1];

		for (int i = 0; i < edge; i++) {
			int node_1 = sc.nextInt();
			int node_2 = sc.nextInt();
			dfsGraph[node_1][node_2] = dfsGraph[node_2][node_1] = 1;
			bfsGraph[node_1][node_2] = bfsGraph[node_2][node_1] = 1;
		}

		dfs(startVertex);
		System.out.println();
		bfs(startVertex);
	}

	private static void dfs(int startVertex) {
		dfsVisited[startVertex] = true;
		System.out.print(startVertex + " ");

		for (int i = 1; i <= vertex; i++) {
			if (!dfsVisited[i] && dfsGraph[startVertex][i] == 1 && dfsGraph[i][startVertex] == 1) {
				dfs(i);
			}
		}
	}

	private static void bfs(int startVertex) {
		bfsVisited[startVertex] = true;
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(startVertex);

		while (!queue.isEmpty()) {
			int q = queue.poll();
			System.out.print(q + " ");

			for (int i = 1; i <= vertex; i++) {
				if (!bfsVisited[i] && bfsGraph[i][q] == 1 && bfsGraph[q][i] == 1) {
					bfsVisited[i] = true;
					queue.offer(i);
				}
			}
		}
	}
}