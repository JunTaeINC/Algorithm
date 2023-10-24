package com.baekjoon.silver.p1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String base = br.readLine();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        for (char b : base.toCharArray()) {
            left.add(b);
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c) {
                case 'L' -> {
                    if (left.isEmpty()) break;
                    right.push(left.pop());
                }
                case 'D' -> {
                    if (right.isEmpty()) break;
                    left.push(right.pop());
                }
                case 'B' -> {
                    if (left.isEmpty()) break;
                    left.pop();
                }
                case 'P' -> left.push(command.charAt(2));
            }
        }

        for (char l : left) {
            sb.append(l);
        }

        while (!right.isEmpty()) {
            sb.append(right.pop());
        }

        System.out.println(sb);
    }
}