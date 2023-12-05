package com.baekjoon.gold.p1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int length;
    static String[] words;
    static boolean[] isVisited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        length = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        words = br.readLine().split(" ");
        Arrays.sort(words);
        isVisited = new boolean[N];

        dfs(0, 0, "");

        System.out.println(sb);
    }

    private static void dfs(int depth, int index, String word) {
        if (depth == length) {
            if (check(word)) {
                sb.append(word).append("\n");
                return;
            }
        }

        for (int i = index; i < words.length; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                dfs(depth + 1, i + 1, word + words[i]);
                isVisited[i] = false;
            }
        }
    }

    private static boolean check(String target) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

        long count = target.chars()
                .filter(t -> vowels.contains((char) t))
                .count();

        return count >= 1 && target.length() - count >= 2;
    }
}