package platform.baekjoon.silver.p13305;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] length = new long[N - 1];
        for (int i = 0; i < length.length; i++) {
            length[i] = sc.nextInt();
        }

        long[] costs = new long[N];
        for (int i = 0; i < N; i++) {
            costs[i] = sc.nextInt();
        }

        long answer = 0;
        long m = Integer.MAX_VALUE;
        for (int i = 0; i < costs.length - 1; i++) {
            m = Math.min(costs[i], m);
            answer += m * length[i];
        }

        System.out.println(answer);
    }
}