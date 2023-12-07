package platform.baekjoon.gold.p2573;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static int Y;
    static int X;
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        map = new int[Y][X];

        for (int i = 0; i < Y; i++) {
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int years = 0;
        int count;

        while ((count = getPieces()) < 2) {
            if (count == 0) {
                years = 0;
                break;
            }

            melt();
            years++;
        }

        System.out.println(years);
    }

    private static int getPieces() {
        int count = 0;
        boolean[][] isVisited = new boolean[Y][X];

        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if (!isVisited[i][j] && map[i][j] != 0) {
                    dfs(i, j, isVisited);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int y, int x, boolean[][] isVisited) {
        isVisited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if (ny < 0 || nx < 0 || ny >= Y || nx >= X) {
                continue;
            }
            if (!isVisited[ny][nx] && map[ny][nx] != 0) {
                dfs(ny, nx, isVisited);
            }
        }
    }


    private static void melt() {
        boolean[][] isVisited = new boolean[Y][X];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if (map[i][j] != 0) {
                    isVisited[i][j] = true;
                    queue.add(new int[]{i, j});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] q = queue.poll();
            int y = q[0];
            int x = q[1];
            int zeroCount = 0;

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || nx < 0 || ny >= Y || nx >= X) {
                    continue;
                }
                if (!isVisited[ny][nx] && map[ny][nx] == 0) {
                    zeroCount++;
                }
            }

            if (map[y][x] - zeroCount < 0) {
                map[y][x] = 0;
            } else {
                map[y][x] -= zeroCount;
            }
        }
    }
}