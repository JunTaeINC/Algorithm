package platform.baekjoon.gold.p2023;

import java.util.Scanner;

public class Main {

    static int N;
    static StringBuilder answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        answer = new StringBuilder();

        backtracking(0, 0);

        System.out.println(answer);
    }

    private static void backtracking(int number, int depth) {
        if (depth == N) {
            if (isPrime(number)) answer.append(number).append("\n");
            return;
        }

        for (int i = 1; i <= 9; i++) {
            int temp = number * 10 + i;
            if (isPrime(temp)) {
                backtracking(temp, depth + 1);
            }
        }

    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;

        int range = (int) Math.sqrt(number);
        for (int i = 2; i <= range; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}