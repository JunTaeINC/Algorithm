package platform.baekjoon.silver.p15663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] temp, arr;
    static boolean[] isVisited;
    static LinkedHashSet<String> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        answer = new LinkedHashSet<>();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        temp = new int[M];
        isVisited = new boolean[N];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        backtracking(0);

        answer.forEach(System.out::println);
    }

    private static void backtracking(int depth) {
        if (depth == M) {
            append();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisited[i]) {
                temp[depth] = arr[i];
                isVisited[i] = true;
                backtracking(depth + 1);
                isVisited[i] = false;
            }
        }
    }

    private static void append() {
        StringBuilder sb = new StringBuilder();
        for (int t : temp) {
            sb.append(t).append(" ");
        }

        answer.add(sb.toString());
    }
}