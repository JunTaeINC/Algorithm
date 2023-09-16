package com.topcoder.beginner;

public class NumberMagicEasy {
    static int[] card_1 = {1, 2, 3, 4, 5, 6, 7, 8};
    static int[] card_2 = {1, 2, 3, 4, 9, 10, 11, 12};
    static int[] card_3 = {1, 2, 5, 6, 9, 10, 13, 14};
    static int[] card_4 = {1, 3, 5, 7, 9, 11, 13, 15};

    public static int solution(String number) {
        int answer = 0;

        for (int i = 1; i <= 16; i++) {
            if (check(i, card_1) != number.charAt(0)) continue;
            if (check(i, card_2) != number.charAt(1)) continue;
            if (check(i, card_3) != number.charAt(2)) continue;
            if (check(i, card_4) != number.charAt(3)) continue;

            answer = i;
        }

        return answer;
    }

    private static char check(int target, int[] arr) {
        for (int a : arr) {
            if (a == target) return 'Y';
        }
        return 'N';
    }

    public static void main(String[] args) {
        // test case 0 : return 5;
        System.out.println(solution("YNYY"));

        // test case 1 : return 8;
        System.out.println(solution("YNNN"));

        // test case 2 : return 16;
        System.out.println(solution("NNNN"));

        // test case 3 : return 1;
        System.out.println(solution("YYYY"));

        // test case 4 : return 11;
        System.out.println(solution("NYNY"));
    }
}