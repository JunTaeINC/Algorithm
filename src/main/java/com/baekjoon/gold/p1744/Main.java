package com.baekjoon.gold.p1744;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> plus = new PriorityQueue<>((o1, o2) -> o2 - o1);
        Queue<Integer> minus = new PriorityQueue<>();
        boolean isZero = false;

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                isZero = true;
            } else if (number >= 1) {
                plus.offer(number);
            } else {
                minus.offer(number);
            }
        }

        int plusSum = 0, minusSum = 0;

        while (plus.size() > 1) {
            int a = plus.poll();
            int b = plus.poll();

            plusSum += Math.max(a * b, a + b);
        }

        if (!plus.isEmpty()) plusSum += plus.poll();

        while (minus.size() > 1) {
            minusSum += (minus.poll() * minus.poll());
        }

        if (!minus.isEmpty()) {
            if (!isZero) {
                minusSum += minus.poll();
            }
        }

        System.out.println(plusSum + minusSum);
    }
}