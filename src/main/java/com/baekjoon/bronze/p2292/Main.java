package com.baekjoon.bronze.p2292;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int min = 2;

        if(N == 1) {
            System.out.println(1);
        } else {
            while(min <= N) {
                min += 6 * count;
                count++;
            }
            System.out.println(count);
        }

    }
}