package platform.baekjoon.silver.p2468;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] isVisited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        int max = 0;
        for (int i = 0; i < N; i++) {
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            max = Math.max(max, Arrays.stream(map[i]).max().getAsInt());
        }

        int answer = 0;
        for (int h = 0; h <= max; h++) {
            isVisited = new boolean[N][N];
            int safe = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!isVisited[i][j] && map[i][j] > h) {
                        dfs(i, j, h);
                        safe++;
                    }
                }
            }

            answer = Math.max(answer, safe);
        }

        System.out.println(answer);
    }

    private static void dfs(int x, int y, int h) {
        isVisited[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (0 <= nx && 0 <= ny && nx < N && ny < N && !isVisited[nx][ny] && map[nx][ny] > h) {
                dfs(nx, ny, h);
            }
        }
    }
}