package platform.baekjoon.silver.p15650;

import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[] temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        temp = new int[M];

        dfs(0, 0);
    }

    private static void dfs(int num, int depth) {
        if (depth == M) {
            for (int t : temp) {
                System.out.print(t + " ");
            }
            System.out.println();
            return;
        }

        for (int i = num; i < N; i++) {
            temp[depth] = i + 1;
            dfs(i + 1, depth + 1);
        }
    }
}