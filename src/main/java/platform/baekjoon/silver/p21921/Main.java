package platform.baekjoon.silver.p21921;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int length = sc.nextInt();
        int[] views = new int[N];
        for (int i = 0; i < N; i++) {
            views[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += views[i];
        }

        int max = sum;
        int count = 1;
        for (int i = length; i < N; i++) {
            sum += views[i] - views[i - length];
            if (sum > max) {
                max = sum;
                count = 1;
            } else if (sum == max) {
                count++;
            }
        }

        if (max == 0) {
            System.out.println("SAD");
            return;
        }

        System.out.println(max);
        System.out.println(count);
    }
}