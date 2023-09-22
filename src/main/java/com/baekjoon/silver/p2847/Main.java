package com.baekjoon.silver.p2847;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int N = sc.nextInt();
        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        for (int i = N - 2; i >= 0; i--) {
            if (score[i] >= score[i + 1]) {
                answer += score[i] - score[i + 1] + 1;
                score[i] = score[i + 1] - 1;

            }
        }

        System.out.println(answer);
    }
}