package platform.baekjoon.bronze.p2810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String seats = br.readLine();

        int count = 1;

        for (int i = 0; i < seats.length(); i++) {
            if (seats.charAt(i) == 'S') {
                count++;
            } else {
                count++;
                i++;
            }
        }

        System.out.println(Math.min(count, N));
    }
}