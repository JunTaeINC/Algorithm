package platform.baekjoon.silver.p20125;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] heart;
    static int[] answer;
    static String[][] cookie;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        cookie = new String[N][N];
        answer = new int[5];

        for (int i = 0; i < N; i++) {
            cookie[i] = br.readLine().split("");
        }

        heart = getHeart();
        getHandCount();
        getHeightCount();
        getFootCount();
        System.out.printf("%d %d\n", heart[0] + 1, heart[1] + 1);
        System.out.printf("%d %d %d %d %d", answer[0], answer[1], answer[2], answer[3], answer[4]);
    }

    private static void getFootCount() {
        int leftFoot = 0;
        int rightFoot = 0;
        for (int i = heart[0] + answer[2] + 1; i < N; i++) {
            if (cookie[i][heart[1] - 1].equals("*")) leftFoot++;
            if (cookie[i][heart[1] + 1].equals("*")) rightFoot++;
            if (!cookie[i][heart[1] + 1].equals("*") && !cookie[i][heart[1] - 1].equals("*")) break;
        }

        answer[3] = leftFoot;
        answer[4] = rightFoot;
    }

    private static void getHeightCount() {
        int height = 0;
        for (int i = heart[0] + 1; i < N; i++) {
            if (cookie[i][heart[1]].equals("*")) {
                height++;
            } else {
                break;
            }
        }

        answer[2] = height;
    }

    private static void getHandCount() {
        int leftHand = 0;
        int rightHand = 0;
        for (int i = 0; i < N; i++) {
            if (cookie[heart[0]][i].equals("*") && i < heart[1]) leftHand++;
            if (cookie[heart[0]][i].equals("*") && i > heart[1]) rightHand++;
        }

        answer[0] = leftHand;
        answer[1] = rightHand;
    }

    private static int[] getHeart() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (cookie[i][j].equals("*")) {
                    return new int[]{i + 1, j};
                }
            }
        }

        return new int[2];
    }
}