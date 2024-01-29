package platform.baekjoon.gold.p15686;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N, M, answer;
    static int[][] map;
    static boolean[] isVisited;
    static List<Point> house, chicken;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        answer = Integer.MAX_VALUE;

        map = new int[N][N];
        house = new ArrayList<>();
        chicken = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) house.add(new Point(i, j));
                if (map[i][j] == 2) chicken.add(new Point(i, j));
            }
        }

        isVisited = new boolean[chicken.size()];
        backtracking(0, 0);
        System.out.println(answer);
    }

    private static void backtracking(int start, int depth) {
        if (depth == M) {
            calculate();
            return;
        }

        for (int i = start; i < chicken.size(); i++) {
            isVisited[i] = true;
            backtracking(i + 1, depth + 1);
            isVisited[i] = false;
        }
    }

    private static void calculate() {
        int sum = 0;
        for (int i = 0; i < house.size(); i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = 0; j < chicken.size(); j++) {
                if (isVisited[j]) {
                    int dist = Math.abs(house.get(i).x - chicken.get(j).x)
                            + Math.abs(house.get(i).y - chicken.get(j).y);
                    temp = Math.min(temp, dist);
                }
            }

            sum += temp;
        }

        answer = Math.min(answer, sum);
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}