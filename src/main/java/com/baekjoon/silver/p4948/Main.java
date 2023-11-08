package com.baekjoon.silver.p4948;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) break;

            int count = 0;
            for (int i = number + 1; i <= number * 2; i++) {
                if (isPrime(i)) count++;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;

        int range = (int) Math.sqrt(number);

        for (int i = 2; i <= range; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}