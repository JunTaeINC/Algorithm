package platform.baekjoon.silver.p2003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, end = 0, sum = 0, answer = 0;
        while (true) {
            if (sum >= target) {
                sum -= arr[start];
                start++;
            } else if (end == arr.length) {
                break;
            } else {
                sum += arr[end];
                end++;
            }

            if (sum == target) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}