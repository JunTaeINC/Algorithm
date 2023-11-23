package com.baekjoon.silver.p15656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int[] temp;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        temp = new int[M];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

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
            temp[depth] = arr[i];
            dfs(depth + 1);
        }
    }
}