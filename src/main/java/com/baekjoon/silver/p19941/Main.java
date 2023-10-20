package com.baekjoon.silver.p19941;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int answer = 0;
        String str = sc.next();
        boolean[] isEat = new boolean[N];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'P') {
                int left = Math.max(0, i - M);
                int right = Math.min(N - 1, i + M);
                for (int j = left; j <= right; j++) {
                    if(str.charAt(j) == 'H' && !isEat[j]) {
                        isEat[j] = true;
                        answer++;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}