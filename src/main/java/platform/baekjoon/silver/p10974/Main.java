package platform.baekjoon.silver.p10974;

import java.util.Scanner;

public class Main {

    static int N;
    static int[] temp;
    static boolean[] isVisited;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        temp = new int[N];
        isVisited = new boolean[N];
        backtracking(0);

        System.out.println(answer);
    }

    private static void backtracking(int depth) {
        if (depth == N) {
            for (int t : temp) answer.append(t).append(" ");
            answer.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                temp[depth] = i + 1;
                backtracking(depth + 1);
                isVisited[i] = false;
            }
        }
    }
}