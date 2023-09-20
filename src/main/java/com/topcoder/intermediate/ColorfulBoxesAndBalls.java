package com.topcoder.intermediate;

public class ColorfulBoxesAndBalls {

    public static int solution(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors) {
        int answer = Integer.MIN_VALUE;
        int change = Math.min(numBlue, numRed);
        int count = 0;

        while (change >= count) {
            int temp = (numRed - count) * onlyRed
                    + (numBlue - count) * onlyBlue
                    + (bothColors * count * 2);

            answer = Math.max(answer, temp);

            count++;
        }

        return answer;
    }

    public static int solution_V2(int numRed, int numBlue, int onlyRed, int onlyBlue, int bothColors) {
        int answer = Integer.MIN_VALUE;
        int change = Math.min(numRed, numBlue);

        for (int i = 0; i <= change; i++) {
            int temp = (numRed - i) * onlyRed
                    + (numBlue - i) * onlyBlue
                    + (bothColors * 2 * i);

            answer = Math.max(answer, temp);
        }

        return answer;
    }


    public static void main(String[] args) {
        // test case 0 : return 1400
        System.out.println(solution(2, 3, 100, 400, 200));

        // test case 1 : return 1600
        System.out.println(solution(2, 3, 100, 400, 300));

        // test case 2 : return 4640
        System.out.println(solution(5, 5, 464, 464, 464));

        // test case 3 : return -100
        System.out.println(solution_V2(1, 4, 20, -30, -10));

        // test case 4 : return 0
        System.out.println(solution_V2(9, 1, -1, -10, 4));
    }
}