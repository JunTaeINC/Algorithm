package com.baekjoon.bronze.p23971;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int X = sc.nextInt();
        int disY = sc.nextInt();
        int disX = sc.nextInt();

        int y = (Y - 1) / (disY + 1) + 1;
        int x = (X - 1) / (disX + 1) + 1;

        System.out.println(y * x);
    }
}