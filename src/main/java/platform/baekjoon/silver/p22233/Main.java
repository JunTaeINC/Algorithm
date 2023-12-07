package platform.baekjoon.silver.p22233;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int memo = Integer.parseInt(st.nextToken());
        int blog = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < memo; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < blog; i++) {
            String[] temp = br.readLine().split(",");
            for (String t : temp) {
                set.remove(t);
            }

            System.out.println(set.size());
        }
    }
}