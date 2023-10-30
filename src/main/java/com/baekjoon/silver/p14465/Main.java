package com.baekjoon.silver.p14465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[M + 1];
        for (int i = 0; i < N; i++) {
            int index = Integer.parseInt(br.readLine());
            arr[index] = 1;
        }

        int sum = 0;
        for (int i = 1; i <= target; i++) {
            sum += arr[i];
        }

        int answer = sum;
        for (int i = target + 1; i <= M; i++) {
            sum += arr[i] - arr[i - target];
            answer = Math.min(answer, sum);
        }

        System.out.println(answer);
//        for (int i = 1; i <= M; i++) {
//            arr[i] += arr[i - 1];
//        }
//
//        int answer = arr[target];
//        for (int i = target; i <= M; i++) {
//            answer = Math.min(answer, arr[i] - arr[i - target]);
//        }
//
//        System.out.println(answer);
    }
}