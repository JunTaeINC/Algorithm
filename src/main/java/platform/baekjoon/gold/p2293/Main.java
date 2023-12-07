package platform.baekjoon.gold.p2293;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int[] money = new int[N];
        int[] dp = new int[T + 1];
        dp[0] = 1;

        for (int i = 0; i < N; i++) {
            money[i] = Integer.parseInt(br.readLine());
        }

        for (int m : money) {
            for (int i = 1; i <= T; i++) {
                if (i - m >= 0) {
                    dp[i] += dp[i - m];
                }
            }
        }

        System.out.println(dp[T]);
    }
}