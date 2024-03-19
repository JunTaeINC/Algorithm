package platform.baekjoon.silver.p1758;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long answer = 0;
        int[] tips = new int[N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            tips[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tips);

        for (int i = N - 1; i >= 0; i--) {
            int tip = tips[i] - (N - i - 1);

            if (tip <= 0) {
                break;
            }

            answer += tip;
        }

        System.out.println(answer);
    }
}