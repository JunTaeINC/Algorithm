package com.baekjoon.silver.p1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String target = br.readLine();
        String str = br.readLine();

        int count = 0;
        int index = 0;

        while ((index = target.indexOf(str, index)) != -1) {
            count++;
            index += str.length();
        }

        System.out.println(count);
    }
}