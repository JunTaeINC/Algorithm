package platform.baekjoon.silver.p2331;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int P = sc.nextInt();

        List<Integer> answer = new ArrayList<>();
        answer.add(A);

        while (true) {
            int now = getNextNumber(A, P);

            if (answer.contains(now)) {
                System.out.println(answer.indexOf(now));
                break;
            }

            answer.add(now);
            A = now;
        }
    }

    private static int getNextNumber(int A, int P) {
        int value = 0;

        while (A != 0) {
            value += Math.pow(A % 10, P);
            A /= 10;
        }

        return value;
    }
}