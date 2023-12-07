package platform.baekjoon.silver.p1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        int[] materials = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int start = 0, end = N-1, answer = 0 , sum;
        while (start < end) {
            sum = materials[start] + materials[end];

            if(sum < T) {
                start++;
            } else if (sum > T) {
                end--;
            } else {
                answer++;
                start++;
                end--;
            }
        }

        System.out.println(answer);
    }
}