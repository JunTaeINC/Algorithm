package platform.baekjoon.gold.p12919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String start = br.readLine();
        String target = br.readLine();

        System.out.println(dfs(start, target) ? 1 : 0);
    }


    private static boolean dfs(String start, String target) {
        if (start.length() == target.length()) {
            return start.equals(target);
        }

        if (target.charAt(0) == 'B' && dfs(start, new StringBuilder(target.substring(1)).reverse().toString())) {
            return true;

        }

        if (target.charAt(target.length() - 1) == 'A' && dfs(start, target.substring(0, target.length() - 1))) {
            return true;
        }

        return false;
    }
}