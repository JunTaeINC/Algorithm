package com.baekjoon.silver.p15903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int change = Integer.parseInt(st.nextToken());

        long[] temp = Arrays.stream(br.readLine().split(" "))
                .mapToLong(Long::parseLong)
                .sorted()
                .toArray();

        for (int i = 0; i < change; i++) {
            long sum = temp[0] + temp[1];
            temp[0] = sum;
            temp[1] = sum;
            Arrays.sort(temp);
        }

        System.out.println(Arrays.stream(temp).sum());
    }
}