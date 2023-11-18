package com.baekjoon.bronze.p13458;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long min = 0;
        int[] student = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int main = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());

        for (int s : student) {
            min++;
            s -= main;
            if (s <= 0) continue;
            min += s / sub;
            if (s % sub != 0) {
                min++;
            }
        }

        System.out.println(min);
    }
}