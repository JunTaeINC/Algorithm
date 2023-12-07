package platform.baekjoon.bronze.p5073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (Arrays.stream(temp).sum() == 0) break;

            Arrays.sort(temp);

            if (temp[2] >= temp[0] + temp[1]) {
                System.out.println("Invalid");
            } else if (temp[0] == temp[1] && temp[1] == temp[2]) {
                System.out.println("Equilateral");
            } else if (temp[0] == temp[1] || temp[1] == temp[2] || temp[0] == temp[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}