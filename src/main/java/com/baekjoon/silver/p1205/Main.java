package com.baekjoon.silver.p1205;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int score = sc.nextInt();
        int length = sc.nextInt();

        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            rank[i] = sc.nextInt();
        }

        if (N == length && rank[rank.length - 1] >= score) {
            System.out.println(-1);
            return;
        }

        int count = 1;
        for (int r : rank) {
            if (score >= r) {
                System.out.println(count);
                return;
            }
            count++;
        }

        System.out.println(count);
    }
}