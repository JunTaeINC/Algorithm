package platform.baekjoon.silver.p2607;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String target = sc.next();

        String[] words = new String[N - 1];
        for (int i = 0; i < N - 1; i++) {
            words[i] = sc.next();
        }

        int count = 0;
        for (String temp : words) {
            if (isSimilar(target, temp)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isSimilar(String target, String str) {
        int[] counts = new int[26];
        for (char t : target.toCharArray()) {
            counts[t - 'A']++;
        }
        for (char s : str.toCharArray()) {
            counts[s - 'A']--;
        }

        int plusOne = 0;
        int minusOne = 0;

        for (int c : counts) {
            if (c == 1) plusOne++;
            if (c == -1) minusOne++;

            if (Math.abs(c) > 1 || plusOne > 1 || minusOne > 1)
                return false;
        }

        return true;
    }
}