package platform.baekjoon.silver.p1446;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] dp = new int[M + 1];
        int[][] shortcuts = new int[N][3];

        for (int i = 0; i < N; i++) {
            shortcuts[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        Arrays.sort(shortcuts, Comparator.comparingInt(o -> o[0]));

        for (int i = 1; i <= M; i++) {
            dp[i] = dp[i - 1] + 1;
            for (int[] shortcut : shortcuts) {
                if (i == shortcut[1]) {
                    dp[i] = Math.min(dp[i], dp[shortcut[0]] + shortcut[2]);
                }
            }
        }

        System.out.println(dp[M]);
    }
}