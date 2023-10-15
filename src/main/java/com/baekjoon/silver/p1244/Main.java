package com.baekjoon.silver.p1244;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int switchCount = sc.nextInt();
        int[] arr = new int[switchCount];

        for (int i = 0; i < switchCount; i++) {
            arr[i] = sc.nextInt();
        }

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int mw = sc.nextInt();
            int number = sc.nextInt();
            int index = number - 1;
            if (mw == 1) {
                man(arr, number, index);
            } else {
                women(arr, index);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    private static void man(int[] arr, int number, int index) {
        while (index < arr.length) {
            if (arr[index] == 0) {
                arr[index] = 1;
            } else {
                arr[index] = 0;
            }
            index += number;
        }
    }

    private static void women(int[] arr, int index) {
        if (arr[index] == 1) {
            arr[index] = 0;
        } else {
            arr[index] = 1;
        }

        int count = 1;
        while ((index - count) >= 0 && (count + index) < arr.length) {
            if (arr[index - count] == arr[index + count]) {
                if (arr[index - count] == 1) {
                    arr[index - count] = 0;
                    arr[index + count] = 0;
                } else {
                    arr[index - count] = 1;
                    arr[index + count] = 1;
                }
                count++;
            } else {
                break;
            }
        }
    }
}