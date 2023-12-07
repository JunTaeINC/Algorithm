package platform.baekjoon.silver.p17610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] isTrue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        M = Arrays.stream(arr).sum();
        isTrue = new boolean[M + 1];

        dfs(0, 0);

        int count = 0;

        for (int i = 1; i < isTrue.length; i++) {
            if (!isTrue[i]) count++;
        }

        System.out.println(count);
    }

    private static void dfs(int weight, int depth) {
        if (depth == N) {
            isTrue[weight] = true;
            return;
        }

        dfs(weight + arr[depth], depth + 1);
        dfs(weight, depth + 1);
        dfs(Math.abs(weight - arr[depth]), depth + 1);
    }
}