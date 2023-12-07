package platform.baekjoon.silver.p2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[] isVisited;
    static int count = 0;
    static int computers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        computers = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());

        map = new int[computers + 1][computers + 1];
        isVisited = new boolean[computers + 1];

        for (int i = 0; i < edges; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            map[start][end] = map[end][start] = 1;
        }

        dfs(1);

        System.out.println(count - 1);
    }

    private static void dfs(int start) {
        isVisited[start] = true;
        count++;

        for (int i = 0; i <= computers; i++) {
            if (!isVisited[i] && map[start][i] == 1) {
                dfs(i);
            }
        }
    }
}