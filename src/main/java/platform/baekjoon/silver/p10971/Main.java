package platform.baekjoon.silver.p10971;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int N, answer;
    static boolean[] isVisited;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        answer = Integer.MAX_VALUE;
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

//        for (int i = 0; i < N; i++) {
//            isVisited = new boolean[N];
//            isVisited[i] = true;
//            backtracking(i, i, 0, 0);
//        }

        isVisited = new boolean[N];
        isVisited[0] = true;
        backtracking(0, 0, 0, 0);

        System.out.println(answer);
    }

    private static void backtracking(int start, int now, int depth, int cost) {
        if (depth == N - 1 && arr[now][start] != 0) {
            answer = Math.min(answer, cost + arr[now][start]);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisited[i] && arr[now][i] != 0) {
                isVisited[i] = true;
                backtracking(start, i, depth + 1, cost + arr[now][i]);
                isVisited[i] = false;
            }
        }
    }
}