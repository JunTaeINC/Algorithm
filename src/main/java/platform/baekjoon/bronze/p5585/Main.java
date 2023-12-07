package platform.baekjoon.bronze.p5585;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 1000 - sc.nextInt();
        int[] money = {500, 100, 50, 10, 5, 1};
        int answer = 0;

        for (int m : money) {
            if (N / m != 0) {
                answer += N / m;
                N %= m;
            }

            if (N == 0) break;
        }

        System.out.println(answer);
    }
}