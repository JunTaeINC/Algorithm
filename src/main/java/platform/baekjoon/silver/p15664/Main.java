package platform.baekjoon.silver.p15664;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] store, temp;
    static LinkedHashSet<String> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        store = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(store);

        temp = new int[M];
        answer = new LinkedHashSet<>();

        backtrack(0, 0);

        answer.forEach(System.out::println);
    }

    private static void backtrack(int depth, int start) {
        if (depth == M) {
            addCombination();
            return;
        }

        for (int i = start; i < N; i++) {
            temp[depth] = store[i];
            backtrack(depth + 1, i + 1);
        }
    }

    private static void addCombination() {
        StringBuilder sb = new StringBuilder();
        for (int number : temp) {
            sb.append(number).append(" ");
        }
        answer.add(sb.toString());
    }
}