package com.baekjoon.silver.p1515;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        int start = 1;
        int index = 0;
        while (true) {
            String target = String.valueOf(start);
            for (int i = 0; i < target.length(); i++) {
                if (target.charAt(i) == N.charAt(index)) {
                    index++;
                }
                if (index == N.length()) {
                    System.out.println(start);
                    return;
                }
            }
            start++;
        }
    }
}