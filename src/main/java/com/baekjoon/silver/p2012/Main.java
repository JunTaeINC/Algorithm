package com.baekjoon.silver.p2012;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            rank[i] = sc.nextInt();
        }

        Arrays.sort(rank);
        long count = 0;

        for (int i = 0; i < N; i++) {
            count += Math.abs(i + 1 - rank[i]);

        }

        System.out.println(count);
    }
}