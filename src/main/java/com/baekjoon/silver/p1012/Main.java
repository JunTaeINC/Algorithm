package com.baekjoon.silver.p1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int Y;
    static int X;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            map = new int[X][Y];
            isVisited = new boolean[X][Y];

            for (int n = 0; n < N; n++) {
                st = new StringTokenizer(br.readLine());
                map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
            }

            int answer = 0;
            for (int x = 0; x < X; x++) {
                for (int y = 0; y < Y; y++) {
                    if (!isVisited[x][y] && map[x][y] == 1) {
                        bfs(x, y);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }
    }

    private static void bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        isVisited[x][y] = true;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (ny < 0 || nx < 0 || ny >= Y || nx >= X) {
                    continue;
                }
                if (!isVisited[nx][ny] && map[nx][ny] == 1) {
                    queue.offer(new Point(nx, ny));
                    isVisited[nx][ny] = true;
                }
            }
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}