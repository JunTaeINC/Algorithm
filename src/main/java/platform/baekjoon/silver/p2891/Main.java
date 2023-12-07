package platform.baekjoon.silver.p2891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] broken = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int[] spare = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int count = 0;
        for (int i = 0; i < broken.length; i++) {
            for (int j = 0; j < spare.length; j++) {
                if (broken[i] == spare[j]) {
                    count++;
                    broken[i] = -1;
                    spare[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < broken.length; i++) {
            for (int j = 0; j < spare.length; j++) {
                if (broken[i] + 1 == spare[j] || broken[i] - 1 == spare[j]) {
                    count++;
                    broken[i] = -1;
                    spare[j] = -1;
                    break;
                }
            }
        }

        System.out.println(broken.length - count);
    }
}