package com.baekjoon.silver.p2529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int N;
    static String[] signs;
    static List<String> answer = new ArrayList<>();
    static boolean[] isVisited = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        signs = br.readLine().split(" ");

        dfs(0, "");

        Collections.sort(answer);

        System.out.println(answer.get(answer.size() - 1) + "\n" + answer.get(0));
    }

    private static void dfs(int depth, String result) {
        if (depth == N + 1) {
            answer.add(result);
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!isVisited[i]) {
                if (depth == 0 || check(Character.getNumericValue(result.charAt(depth - 1)), i, signs[depth - 1])) {
                    isVisited[i] = true;
                    dfs(depth + 1, result + i);
                    isVisited[i] = false;
                }
            }
        }
    }

    private static boolean check(int a, int b, String sign) {
        if (sign.equals(">")) {
            return a > b;
        } else {
            return a < b;
        }
    }
}