package com.baekjoon.silver.p1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
                        dfs(x, y);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }
    }

    private static void dfs(int x, int y) {
        isVisited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= X || ny >= Y) {
                continue;
            }
            if (!isVisited[nx][ny] && map[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}