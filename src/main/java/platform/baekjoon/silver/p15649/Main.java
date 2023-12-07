package platform.baekjoon.silver.p15649;

import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] isVisited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        isVisited = new boolean[N];

        dfs(0);

        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == M) {
            for (int a : arr) {
                sb.append(a).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                isVisited[i] = false;
            }
        }
    }
}