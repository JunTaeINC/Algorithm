package platform.baekjoon.silver.p2667;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int N;
    static int count;
    static boolean[][] isVisited;
    static String[][] arr;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> answer = new ArrayList<>();

        N = Integer.parseInt(br.readLine());

        isVisited = new boolean[N][N];
        arr = new String[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().split("");
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count = 0;
                if (arr[i][j].equals("1") && !isVisited[i][j]) {
                    dfs(i, j);
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);

        System.out.println(answer.size());
        for (int a : answer) System.out.println(a);
    }

    public static void dfs(int x, int y) {
        isVisited[x][y] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < N && 0 <= ny && ny < N && !isVisited[nx][ny] && arr[nx][ny].equals("1")) {
                dfs(nx, ny);
            }
        }
    }
}