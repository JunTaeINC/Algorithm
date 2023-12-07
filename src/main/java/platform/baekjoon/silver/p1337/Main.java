package platform.baekjoon.silver.p1337;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }

        int answer = 4;
        for (int s : set) {
            int count = 1;
            for (int i = s + 1; i < s + 5; i++) {
                if (set.contains(i)) count++;
            }
            answer = Math.min(answer, 5 - count);
        }

        System.out.println(answer);
    }
}