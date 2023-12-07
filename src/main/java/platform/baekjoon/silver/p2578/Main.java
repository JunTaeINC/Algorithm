package platform.baekjoon.silver.p2578;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[][] map = new int[5][5];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            map[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int answer = 1;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int now = Integer.parseInt(st.nextToken());

                for (int x = 0; x < 5; x++) {
                    for (int y = 0; y < 5; y++) {
                        if (map[x][y] == now) {
                            map[x][y] = 0;
                            break;
                        }
                    }
                }

                int count = checkRow() + checkColumn() + checkDiagonal();
                if (count >= 3) {
                    System.out.println(answer);
                    return;
                }

                answer++;
            }
        }
    }

    private static int checkRow() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int zero = 0;
            for (int j = 0; j < 5; j++) {
                if (map[i][j] == 0) zero++;
            }
            if (zero == 5) count++;
        }
        return count;
    }

    private static int checkColumn() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int zero = 0;
            for (int j = 0; j < 5; j++) {
                if (map[j][i] == 0) zero++;
            }
            if (zero == 5) count++;
        }
        return count;
    }

    private static int checkDiagonal() {
        int count = 0;
        int zero = 0;
        for (int i = 0; i < 5; i++) {
            if (map[i][i] == 0) zero++;
        }

        if (zero == 5) {
            count++;
        }

        zero = 0;
        for (int i = 0; i < 5; i++) {
            if (map[i][4 - i] == 0) zero++;
        }

        if (zero == 5) count++;

        return count;
    }
}