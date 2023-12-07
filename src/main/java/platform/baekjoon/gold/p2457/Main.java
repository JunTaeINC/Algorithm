package platform.baekjoon.gold.p2457;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] flowers = new int[N][2];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int startM = Integer.parseInt(st.nextToken());
            int startD = Integer.parseInt(st.nextToken());
            int endM = Integer.parseInt(st.nextToken());
            int endD = Integer.parseInt(st.nextToken());

            flowers[i][0] = startM * 100 + startD;
            flowers[i][1] = endM * 100 + endD;
        }

        Arrays.sort(flowers, (o1, o2) -> {
            if (o1[0] == o2[0]) return o1[1] - o2[1];
            return o1[0] - o2[0];
        });

        int start = 301, end = 1201, answer = 0, idx = 0, lastEnd = 0;

        if (flowers[0][0] > start) {
            System.out.println(0);
            return;
        }

        while (start < end) {
            boolean isFind = false;

            for (int i = idx; i < flowers.length; i++) {
                if (flowers[i][0] > start) {
                    break;
                }

                if (lastEnd < flowers[i][1]) {
                    lastEnd = flowers[i][1];
                    isFind = true;
                    idx = i + 1;
                }
            }

            if (!isFind) {
                System.out.println(0);
                return;
            } else {
                start = lastEnd;
                answer++;
            }
        }

        System.out.println(answer);
    }
}