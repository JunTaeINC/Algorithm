package platform.baekjoon.silver.p10431;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            int[] temp = new int[20];

            for (int j = 0; j < 20; j++) {
                temp[j] = sc.nextInt();
            }

            int count = 0;
            for (int j = 0; j < temp.length; j++) {
                for (int k = 0; k < j; k++) {
                    if (temp[k] > temp[j]) {
                        count++;
                    }
                }
            }

            System.out.printf("%d %d%n", T, count);
        }
    }
}