package com.baekjoon.silver.p2217;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = Integer.MIN_VALUE;
        int[] ropes = new int[N];

        for (int i = 0; i < N; i++) {
            ropes[i] = sc.nextInt();
        }

        Arrays.sort(ropes);

        for (int i = N - 1; i >= 0; i--) {
            answer = Math.max(answer, ropes[i] * (N - i));
        }

        System.out.println(answer);
    }
}