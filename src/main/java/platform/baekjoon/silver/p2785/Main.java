package platform.baekjoon.silver.p2785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        List<Integer> rings = Arrays.stream(br.readLine().split(" ")).sorted().map(Integer::parseInt).collect(Collectors.toList());

        while (rings.size() > 1) {
            rings.set(0, rings.get(0) - 1);
            rings.remove(rings.size() - 1);
            if (rings.get(0) == 0) rings.remove(0);
            count++;
        }

        System.out.println(count);
    }
}