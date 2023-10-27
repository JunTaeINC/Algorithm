package com.baekjoon.silver.p10610;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] temp = sc.nextLine().toCharArray();

        Arrays.sort(temp);

        if (temp[0] != '0') {
            System.out.println(-1);
            return;
        }

        int sum = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--) {
            sum += temp[i] - '0';
            answer.append(temp[i]);
        }

        if (sum % 3 == 0) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}