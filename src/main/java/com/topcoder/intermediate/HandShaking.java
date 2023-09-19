package com.topcoder.intermediate;

public class HandShaking {

    public static long solution(int number) {
        long[] dp = new long[number / 2 + 1];

        dp[0] = 1;

        for (int i = 1; i <= number / 2; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            /*
                dp[2] += dp[0] * dp[1]; 1
                dp[2] += dp[1] * dp[0]; 1

                dp[3] += dp[0] * dp[2]; 2
                dp[3] += dp[1] * dp[1]; 1
                dp[3] += dp[2] * dp[0]; 2

                dp[4] += dp[0] * dp[3]; 5
                dp[4] += dp[1] * dp[2]; 2
                dp[4] += dp[2] * dp[1]; 2
                dp[4] += dp[3] * dp[0]; 5
             */
            }
        }

        return dp[number / 2];
    }

    public static void main(String[] args) {
        // test case 0 : return 1;
        System.out.println(solution(2));

        // test case 1 : return 2;
        System.out.println(solution(4));

        // test case 2 : return 14;
        System.out.println(solution(8));
    }
}