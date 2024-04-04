package platform.baekjoon.silver.p2583;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int X, Y, K, count;
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] map;
    static List<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[Y][X];

        for (int k = 0; k < K; k++) {
            fillRectangle(br.readLine());
        }

        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                if (map[i][j] == 0) {
                    count = 0;
                    dfs(i, j);
                    answer.add(count);
                }
            }
        }

        Collections.sort(answer);
        System.out.println(answer.size());
        answer.forEach(i -> System.out.print(i + " "));
    }

    private static void fillRectangle(String input) {
        int[] temp = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int x1 = temp[0], y1 = temp[1], x2 = temp[2], y2 = temp[3];

        for (int i = y1; i < y2; i++) {
            for (int j = x1; j < x2; j++) {
                map[i][j] = 1;
            }
        }
    }

    private static void dfs(int y, int x) {
        map[y][x] = 1;
        count++;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny < 0 || nx < 0 || ny >= Y || nx >= X || map[ny][nx] == 1) {
                continue;
            }

            dfs(ny, nx);
        }
    }
}