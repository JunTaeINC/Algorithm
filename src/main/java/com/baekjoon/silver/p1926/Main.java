package com.baekjoon.silver.p1926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int Y;
    static int X;
    static int count;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static String[][] map;
    static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        map = new String[Y][X];
        isVisited = new boolean[Y][X];

        for (int i = 0; i < Y; i++) {
            map[i] = br.readLine().split(" ");
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                count = 0;
                if (!isVisited[i][j] && map[i][j].equals("1")) {
                    dfs(i, j);
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        System.out.println(answer.size() == 0 ? 0 : answer.get(answer.size() - 1));
    }

    private static void dfs(int y, int x) {
        isVisited[y][x] = true;
        count++;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 0 || nx < 0 || ny >= Y || nx >= X) {
                continue;
            }
            if (!isVisited[ny][nx] && map[ny][nx].equals("1")) {
                dfs(ny, nx);
            }
        }
    }
}