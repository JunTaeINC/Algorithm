package platform.baekjoon.bronze.p1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int answer = 0;
        for (int number : numbers) {
            if (isPrime(number)) answer++;
        }

        System.out.println(answer);
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