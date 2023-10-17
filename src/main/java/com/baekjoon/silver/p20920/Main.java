package com.baekjoon.silver.p20920;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.length() >= length) {
                map.put(input, map.getOrDefault(input, 0) + 1);
            }
        }

        List<String> answer = new ArrayList<>(map.keySet());
        answer.sort(((o1, o2) -> {
            if ((int) map.get(o1) != map.get(o2)) {
                return Integer.compare(map.get(o2), map.get(o1));
            }
            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }

            return o1.compareTo(o2);
        }));

        for (String a : answer) {
            bw.write(a);
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}