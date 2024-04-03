package platform.baekjoon.silver.p1189;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int answer, Y, X, D;
    static int[] ny = {1, 0, -1, 0};
    static int[] nx = {0, 1, 0, -1};
    static char[][] map;
    static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        answer = 0;
        map = new char[Y][X];
        isVisited = new boolean[Y][X];

        for (int i = 0; i < Y; i++) {
            map[i] = br.readLine().toCharArray();
        }

        isVisited[Y - 1][0] = true;
        dfs(Y - 1, 0, 1);

        System.out.println(answer);
    }

    private static void dfs(int y, int x, int distance) {
        if (y == 0 && x == X - 1 && distance == D) {
            answer++;
            return;
        }


        for (int i = 0; i < 4; i++) {
            int dy = y + ny[i];
            int dx = x + nx[i];
            if (dy < 0 || dx < 0 || dy >= Y || dx >= X) {
                continue;
            }

            if (isVisited[dy][dx] || map[dy][dx] == 'T') {
                continue;
            }

            isVisited[dy][dx] = true;
            dfs(dy, dx, distance + 1);
            isVisited[dy][dx] = false;
        }
    }
}