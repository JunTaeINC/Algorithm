package platform.baekjoon.silver.p1449;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        int N = Integer.parseInt(st.nextToken());
        int tapeLength = Integer.parseInt(st.nextToken());

        int[] holes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int coverArea = 0;

        for (int hole : holes) {
            if (hole > coverArea) {
                count++;
                coverArea = hole + tapeLength - 1;
            }
        }

        System.out.println(count);
    }
}