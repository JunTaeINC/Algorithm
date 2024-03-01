package platform.baekjoon.silver.p16967;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder answer = new StringBuilder();

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[][] arrA = new int[H][W];
        int[][] arrB = new int[H + X][W + Y];

        for (int i = 0; i < H + X; i++) {
            arrB[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i >= X && j >= Y) {
                    arrA[i][j] = arrB[i][j] - arrA[i - X][j - Y];
                } else if (i < X || j < Y) {
                    arrA[i][j] = arrB[i][j];
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                answer.append(arrA[i][j]).append(" ");
            }

            answer.append("\n");
        }

        System.out.println(answer);
    }
}