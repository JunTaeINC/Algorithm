package platform.baekjoon.silver.p1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) sb.append(i).append("\n");
        }

        System.out.println(sb);
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