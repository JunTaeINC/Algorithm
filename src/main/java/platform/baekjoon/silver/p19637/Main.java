package platform.baekjoon.silver.p19637;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] arr = new String[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        for (int i = 0; i < M; i++) {
            int power = Integer.parseInt(br.readLine());
            int start = 0;
            int end = N - 1;
            int mid;
            while (start <= end) {
                mid = (start + end) / 2;
                if (Integer.parseInt(arr[mid][1]) < power) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            sb.append(arr[start][0]).append("\n");
        }

        System.out.println(sb);
    }
}