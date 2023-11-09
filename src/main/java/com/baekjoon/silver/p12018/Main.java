package com.baekjoon.silver.p12018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] values = new int[T];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int people = Integer.parseInt(st.nextToken());
            int limit = Integer.parseInt(st.nextToken());
            int[] peoples = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            int index = people - limit;

            if (index < 0) {
                values[i] = 1;
            } else {
                values[i] = peoples[index];
            }
        }

        Arrays.sort(values);

        int answer = 0;
        for (int v : values) {
            if (M >= v) {
                M -= v;
                answer++;
            } else {
                break;
            }
        }
        System.out.println(answer);
    }
}