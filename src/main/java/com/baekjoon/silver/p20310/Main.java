package com.baekjoon.silver.p20310;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] S = sc.nextLine().split("");

        int zero = (int) Arrays.stream(S).filter(s -> s.equals("0")).count() / 2;
        int one = (int) Arrays.stream(S).filter(s -> s.equals("1")).count() / 2;
        StringBuilder answer = new StringBuilder();

        for (int i = S.length - 1; i > 0; i--) {
            if (S[i].equals("0") && zero != 0) {
                zero--;
                S[i] = "*";
            }
        }

        for (int i = 0; i < S.length; i++) {
            if (S[i].equals("1") && one != 0) {
                one--;
                S[i] = "*";
            }
        }

        for (String s : S) {
            if (s.equals("0") || s.equals("1")) answer.append(s);
        }

        System.out.println(answer);
    }
}