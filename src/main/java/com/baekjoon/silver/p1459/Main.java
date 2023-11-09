package com.baekjoon.silver.p1459;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Integer.parseInt(st.nextToken());
        long Y = Integer.parseInt(st.nextToken());
        long side = Integer.parseInt(st.nextToken());
        long cross = Integer.parseInt(st.nextToken());

        long sides = (X + Y) * side;
        long side_cross = Math.abs(X - Y) * side + Math.min(X, Y) * cross;
        long temp;

        if ((X + Y) % 2 == 0) {
            temp = Math.max(X, Y) * cross;
        } else {
            temp = (Math.max(X, Y) - 1) * cross + side;
        }

        System.out.println(Math.min(sides, Math.min(side_cross, temp)));
    }
}