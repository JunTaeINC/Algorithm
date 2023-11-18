package com.baekjoon.silver.p15649;

import java.util.Scanner;

public class Main {
    static int[] arr;
    static boolean[] isVisited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[M];
        isVisited = new boolean[N];

        dfs(N, M, 0);
    }

    private static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                isVisited[i] = false;
            }
        }
    }
}