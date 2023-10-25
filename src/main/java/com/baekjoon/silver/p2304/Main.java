package com.baekjoon.silver.p2304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] pillar = new int[N][2];
        int maxHeight = 0;
        for (int i = 0; i < N; i++) {
            pillar[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            maxHeight = Math.max(pillar[i][1], maxHeight);
        }

        Arrays.sort(pillar, (o1, o2) -> o1[0] - o2[0]);

        int maxPillar = 0;
        for (
                int i = 0;
                i < pillar.length; i++) {
            if (pillar[i][1] == maxHeight) {
                maxPillar = i;
                break;
            }
        }

        int answer = 0;

        int startPillar = pillar[0][0];
        int startHeight = pillar[0][1];
        for (
                int i = 0;
                i <= maxPillar; i++) {
            if (startHeight <= pillar[i][1]) {
                answer += (pillar[i][0] - startPillar) * startHeight;
                startHeight = pillar[i][1];
                startPillar = pillar[i][0];
            }
        }

        int endPillar = pillar[pillar.length - 1][0];
        int endHeigth = pillar[pillar.length - 1][1];
        for (
                int i = pillar.length - 1;
                i >= maxPillar; i--) {
            if (endHeigth <= pillar[i][1]) {
                answer += (endPillar - pillar[i][0]) * endHeigth;
                endPillar = pillar[i][0];
                endHeigth = pillar[i][1];
            }
        }

        System.out.println(answer + maxHeight);
    }
}