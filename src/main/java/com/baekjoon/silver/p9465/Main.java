package com.baekjoon.silver.p9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr;
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());

            arr = new int[2][M];
            for (int j = 0; j < 2; j++) {
                arr[j] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }

            if (M == 1) {
                System.out.println(Math.max(arr[0][0], arr[1][0]));
            } else {
                arr[0][1] += arr[1][0];
                arr[1][1] += arr[0][0];

                for (int k = 2; k < M; k++) {
                    arr[0][k] = Math.max(arr[1][k - 2], arr[1][k - 1]) + arr[0][k];
                    arr[1][k] = Math.max(arr[0][k - 2], arr[0][k - 1]) + arr[1][k];
                }

                System.out.println(Math.max(arr[0][M - 1], arr[1][M - 1]));
            }
        }
    }
}