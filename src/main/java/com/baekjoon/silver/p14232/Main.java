package com.baekjoon.silver.p14232;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(br.readLine());

        int sosu = 2;
        List<String> list = new ArrayList<>();
        while (number != 1) {
            if (sosu >= 1000000) {
                list.add(number + "");
                break;
            }
            if (number % sosu == 0) {
                number /= sosu;
                list.add(sosu + "");
            } else {
                sosu++;
            }
        }

        System.out.println(list.size());
        System.out.println(String.join(" ", list));
    }
}