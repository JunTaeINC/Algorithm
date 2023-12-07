package platform.baekjoon.silver.p17615;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] balls = br.readLine().toCharArray();

        int redBall = 0;
        int blueBall = 0;

        for (char ball : balls) {
            if (ball == 'R') {
                redBall++;
            } else {
                blueBall++;
            }
        }

        int searchFrontRed = redBall - searchFront(balls, 'R');
        int searchFrontBlue = blueBall - searchFront(balls, 'B');
        int searchBackRed = redBall - searchBack(balls, 'R');
        int searchBackBlue = blueBall - searchBack(balls, 'B');

        System.out.println(Math.min(searchFrontRed, Math.min(searchFrontBlue, Math.min(searchBackRed, searchBackBlue))));
    }

    private static int searchFront(char[] balls, char color) {
        int count = 0;
        for (char ball : balls) {
            if (ball == color) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    private static int searchBack(char[] balls, char color) {
        int count = 0;
        for (int i = balls.length - 1; i >= 0; i--) {
            if (balls[i] == color) {
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}