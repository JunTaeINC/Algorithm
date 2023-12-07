package platform.baekjoon.silver.p14940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int Y;
    static int X;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        map = new int[Y][X];
        isVisited = new boolean[Y][X];
        for (int i = 0; i < Y; i++) {
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        boolean flag = false;
        int startY = 0, startX = 0;
        for (int i = 0; i < Y; i++) {
            if (!flag) {
                for (int j = 0; j < X; j++) {
                    if (map[i][j] == 2) {
                        map[i][j] = 0;
                        flag = true;
                        startY = i;
                        startX = j;
                        break;
                    }
                }
            }
        }

        bfs(startY, startX);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if (!isVisited[i][j] && map[i][j] == 1) {
                    sb.append(-1).append(" ");
                } else {
                    sb.append(map[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void bfs(int startY, int startX) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startY, startX));
        isVisited[startY][startX] = true;
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            int y = point.y;
            int x = point.x;
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny < 0 || nx < 0 || ny >= Y || nx >= X) {
                    continue;
                }
                if (!isVisited[ny][nx] && map[ny][nx] == 1) {
                    queue.add(new Point(ny, nx));
                    isVisited[ny][nx] = true;
                    map[ny][nx] = map[y][x] + 1;
                }
            }
        }
    }

    static class Point {
        int y;
        int x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}