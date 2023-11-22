package com.baekjoon.silver.p1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int min = 64;
    static String[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        map = new String[X];
        for (int i = 0; i < X; i++) {
            map[i] = br.readLine();
        }

        for (int i = 0; i < X - 7; i++) {
            for (int j = 0; j < Y - 7; j++) {
                check(i, j, 'B');
                check(i, j, 'W');
            }
        }

        System.out.println(min);
    }

    private static void check(int x, int y, char bw) {
        int count = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (map[i].charAt(j) == bw) {
                        count++;
                    }
                } else {
                    if (map[i].charAt(j) != bw) {
                        count++;
                    }
                }
            }
        }

        min = Math.min(min, count);
    }
}