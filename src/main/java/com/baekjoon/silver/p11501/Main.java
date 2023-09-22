package com.baekjoon.silver.p11501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            long gain = 0;
            long stocks = Integer.parseInt(br.readLine());

            long[] tempArr = Arrays.stream(br.readLine().split(" "))
                    .mapToLong(Long::parseLong)
                    .toArray();

            long max = 0;

            for (int j = tempArr.length - 1; j >= 0; j--) {
                if (tempArr[j] < max) {
                    gain += (max - tempArr[j]);
                } else {
                    max = tempArr[j];
                }
            }

            System.out.println(gain);
        }
    }
}