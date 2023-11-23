package com.baekjoon.silver.p15651;

import java.util.Scanner;

public class Main {

    static int N;
    static int M;
    static int[] temp;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        temp = new int[M];

        dfs(0);

        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == M) {
            for (int t : temp) {
                sb.append(t).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            temp[depth] = i + 1;
            dfs(depth + 1);
        }
    }
}