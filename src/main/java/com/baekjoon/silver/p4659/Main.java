package com.baekjoon.silver.p4659;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input;
        while (!(input = sc.next()).equals("end")) {
            System.out.println(solution(input) ?
                    "<%s> is acceptable.".formatted(input) :
                    "<%s> is not acceptable.".formatted(input));
        }
    }

    private static boolean solution(String input) {
        boolean hasVowel = false;
        int consecutiveVowels = 0;
        int consecutiveConsonants = 0;
        char lastChar = '7';

        for (char c : input.toCharArray()) {
            if ("aeiuo".indexOf(c) != -1) {
                hasVowel = true;
                consecutiveVowels++;
                consecutiveConsonants = 0;
            } else {
                consecutiveVowels = 0;
                consecutiveConsonants++;
            }

            if (consecutiveConsonants == 3 || consecutiveVowels == 3 || (c == lastChar && c != 'e' && c != 'o')) {
                return false;
            }
            lastChar = c;
        }

        return hasVowel;
    }
}