package com.baekjoon.gold.p7569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][][] map;
    static int[] dy = {1, 0, -1, 0, 0, 0};
    static int[] dx = {0, 1, 0, -1, 0, 0};
    static int[] dh = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int H = temp[0], Y = temp[1], X = temp[2];
        map = new int[X][Y][H];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < H; k++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());
                    if (map[i][j][k] == 1) queue.offer(new int[]{i, j, k, 0});
                }
            }
        }

        int day = 0;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0], y = now[1], h = now[2], d = now[3];
            for (int i = 0; i < 6; i++) {
                int nx = x + dh[i];
                int ny = y + dy[i];
                int nh = h + dx[i];
                if (nh < 0 || ny < 0 || nx < 0 || nh >= H || ny >= Y || nx >= X) continue;
                if (map[nx][ny][nh] == 0) {
                    map[nx][ny][nh] = 1;
                    queue.offer(new int[]{nx, ny, nh, d + 1});
                    day = Math.max(day, d + 1);
                }
            }
        }

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                for (int k = 0; k < H; k++) {
                    if (map[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }

        System.out.println(day);
    }
}