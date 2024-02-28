package platform.baekjoon.silver.p2885;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine()), size = 1, count = 0, temp = 0;

        while (size < K) {
            size = size * 2;
            temp = size;
        }

        while (K > 0) {
            if (K >= size) {
                K -= size;
            } else {
                size /= 2;
                count++;
            }
        }

        System.out.println(temp + " " + count);
    }
}