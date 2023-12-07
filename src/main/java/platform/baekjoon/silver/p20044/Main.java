package platform.baekjoon.silver.p20044;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] student = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int answer = Integer.MAX_VALUE;
        int front = 0;
        int end = student.length - 1;

        for (int i = 0; i < N; i++) {
            answer = Math.min(answer, student[front] + student[end]);
            front++;
            end--;
        }

        System.out.println(answer);
    }
}