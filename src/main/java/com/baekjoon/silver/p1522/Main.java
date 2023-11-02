package com.baekjoon.silver.p1522;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] cha = sc.nextLine().toCharArray();

        int aCount = 0;
        int answer = Integer.MAX_VALUE;

        for (char c : cha) {
            if (c == 'a') aCount++;
        }

        for (int i = 0; i < cha.length; i++) {
            int bCount = 0;
            for (int j = i; j < i + aCount; j++) {
                if (cha[j % cha.length] == 'b') bCount++;
            }
            answer = Math.min(answer, bCount);
        }

        System.out.println(answer);
    }
}