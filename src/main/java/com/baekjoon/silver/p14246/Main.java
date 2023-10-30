package com.baekjoon.silver.p14246;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(br.readLine());

//        long count = 0;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//                if (sum > target) {
//                    count += n - j;
//                    break;
//                }
//            }
//        }

        System.out.println(twoPointer(arr, target));
    }

    private static long twoPointer(int[] arr, int target) {
        int start = 0, end = 0;
        long sum = 0, count = 0;

        while (true) {
            if (sum > target) {
                sum -= arr[start++];
            } else if (end == arr.length) {
                break;
            } else {
                sum += arr[end++];
            }

            if (sum > target) {
                count += arr.length - end + 1;
            }
        }

        return count;
    }
}