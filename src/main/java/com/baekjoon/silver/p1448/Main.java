package com.baekjoon.silver.p1448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer sides[] = new Integer[N];

        for (int i = 0; i < N; i++) {
            sides[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(sides);

        int answer = 0;
        for (int i = N - 1; i >= 2; i--) {
            int sum = sides[i - 1] + sides[i - 2];
            if (sides[i] < sum) {
                answer = sides[i] + sum;
                break;
            }
        }

        System.out.println(answer == 0 ? -1 : answer);
    }
}