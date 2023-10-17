package com.baekjoon.silver.p2512;

import java.util.Scanner;

public class Main {
    static int budget;
    static int[] wantBudget;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), max = 0;
        wantBudget = new int[N];
        for (int i = 0; i < N; i++) {
            wantBudget[i] = sc.nextInt();
            max = Math.max(max, wantBudget[i]);
        }

        budget = sc.nextInt();

        int low = 0, answer = 0;
        while (low <= max) {
            int mid = (low + max) / 2;

            if (isValid(mid)) {
                low = mid + 1;
                answer = mid;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static boolean isValid(int money) {
        int total = 0;
        for (int w : wantBudget) {
            total += Math.min(w, money);
        }

        return total <= budget;
    }
}