package com.baekjoon.silver.p1182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int T;
    static int count = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        dfs(0, 0);

        System.out.println(T == 0 ? count - 1 : count);
    }

    private static void dfs(int sum, int depth) {
        if (depth == N) {
            if (sum == T) {
                count++;
            }
            return;
        }

        dfs(sum + arr[depth], depth + 1);
        dfs(sum, depth + 1);
    }
}