package com.baekjoon.silver.p11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int moneys = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] money = new int[moneys];
        int count = 0;

        for (int i = money.length - 1; i >= 0; i--) {
            money[i] = Integer.parseInt(br.readLine());
        }

        for (int m : money) {
            if (target / m > 0) {
                count += target / m;
                target = target % m;
            }

            if (target == 0) break;
        }

        System.out.println(count);
    }
}