package platform.baekjoon.gold.p7570;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < N; i++) {
            dp[arr[i]] = dp[arr[i] - 1] + 1;
        }

        Arrays.sort(dp);
        System.out.println(N - dp[N]);
    }
}