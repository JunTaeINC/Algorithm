package com.baekjoon.silver.p7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] temp = new int[N][2];

        for (int i = 0; i < N; i++) {
            temp[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < N; i++) {
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (temp[i][0] < temp[j][0] && temp[i][1] < temp[j][1]) {
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}