package platform.baekjoon.silver.p6603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static boolean[] isVisited;
    static int[] arr;
    static int[] temp;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            String input = br.readLine();

            st = new StringTokenizer(input, " ");
            N = Integer.parseInt(st.nextToken());

            if (N == 0) return;

            arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            temp = new int[6];
            isVisited = new boolean[arr.length];
            sb = new StringBuilder();

            dfs(0, 0);

            System.out.println(sb);
        }
    }

    private static void dfs(int index, int depth) {
        if (depth == 6) {
            for (int t : temp) {
                sb.append(t).append(" ");
            }

            sb.append("\n");
            return;
        }

        for (int i = index; i < N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                temp[depth] = arr[i];
                dfs(i, depth + 1);
                isVisited[i] = false;
            }
        }
    }
}