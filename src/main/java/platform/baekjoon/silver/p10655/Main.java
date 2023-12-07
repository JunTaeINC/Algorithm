package platform.baekjoon.silver.p10655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            points[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int total = 0;
        for (int i = 0; i < N - 1; i++) {
            total += Math.abs(points[i][0] - points[i + 1][0]);
            total += Math.abs(points[i][1] - points[i + 1][1]);
        }

        int maxSkip = 0;
        for (int i = 1; i < N - 1; i++) {
            int before = Math.abs(points[i - 1][0] - points[i][0]) + Math.abs(points[i - 1][1] - points[i][1]);
            before += Math.abs(points[i][0] - points[i + 1][0]) + Math.abs(points[i][1] - points[i + 1][1]);
            int after = Math.abs(points[i - 1][0] - points[i + 1][0]) + Math.abs(points[i - 1][1] - points[i + 1][1]);
            maxSkip = Math.max(maxSkip, before - after);
        }

        System.out.println(total - maxSkip);
    }
}