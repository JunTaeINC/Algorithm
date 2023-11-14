package com.baekjoon.silver.p13335;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = temp[0], length = temp[1], limit = temp[2];

        int time = 0;
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> truck = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            truck.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < length; i++) {
            bridge.add(0);
        }

        int sum = 0;
        while (!bridge.isEmpty()) {
            time++;
            sum -= bridge.poll();
            if (!truck.isEmpty()) {
                int t = truck.peek();
                if (sum + t <= limit) {
                    bridge.add(truck.poll());
                    sum += t;
                } else {
                    bridge.add(0);
                }
            }
        }


        System.out.println(time);
    }
}