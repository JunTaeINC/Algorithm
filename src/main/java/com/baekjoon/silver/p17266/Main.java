package com.baekjoon.silver.p17266;

import java.util.Scanner;

public class Main {
    static int[] lamps;
    static int length, N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        N = sc.nextInt();
        lamps = new int[N];

        for (int i = 0; i < N; i++) {
            lamps[i] = sc.nextInt();
        }

        int start = 1;
        int end = length;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (check(mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(result);
    }

    static boolean check(int height) {
        int start = 0;
        for (int lamp : lamps) {
            if (lamp - height <= start) {
                start = lamp + height;
            } else {
                return false;
            }
        }
        return length - start <= 0;
    }
}