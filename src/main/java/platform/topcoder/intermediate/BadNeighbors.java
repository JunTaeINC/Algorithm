package platform.topcoder.intermediate;

import java.util.Arrays;

public class BadNeighbors {

    public static int solution(int[] donations) {
        int startZero = maxDonations(donations, 0, donations.length - 1);
        int startOne = maxDonations(donations, 1, donations.length);

        return Math.max(startZero, startOne);
    }

    public static int maxDonations(int[] donations, int start, int end) {
        int[] dp = new int[donations.length];

        for (int i = start; i < end; i++) {
            dp[i] = donations[i];
            if (i > start) dp[i] = Math.max(dp[i], dp[i - 1]);
            if (i > start + 1) dp[i] = Math.max(dp[i], dp[i - 2] + donations[i]);
        }

        return Arrays.stream(dp).max().getAsInt();
    }


    public static void main(String[] args) {
        // test case 0 : return 19
        System.out.println(solution(new int[]{10, 3, 2, 5, 7, 8}));

        // test case 2 : return 21
        System.out.println(solution(new int[]{7, 7, 7, 7, 7, 7, 7}));

        // test case 3 : return 16
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5}));
    }
}