package platform.baekjoon.silver.p9461;

import java.util.Scanner;

public class Main {
    static long[] dp = new long[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(solution(sc.nextInt()));
        }
    }

    private static long solution(int num) {
        dp[0] = dp[1] = dp[2] = dp[3] = 1;

        for (int i = 4; i <= num; i++) {
            dp[i] = dp[i - 3] + dp[i - 2];
        }

        return dp[num];
    }
}