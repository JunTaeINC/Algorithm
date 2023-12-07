package platform.baekjoon.gold.p17609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();

            if (isTrue(temp)) {
                System.out.println(0);
                continue;
            }

            twoPoint(temp);
        }
    }

    private static void twoPoint(String string) {
        int start = 0;
        int end = string.length() - 1;

        while (start <= end) {
            if (string.charAt(start) != string.charAt(end)) {
                String deleteLeft = string.substring(start + 1, end + 1);
                String deleteRight = string.substring(start, end);
                if (isTrue(deleteLeft) || isTrue(deleteRight)) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
                return;
            }
            start++;
            end--;
        }

        System.out.println(0);
    }

    private static boolean isTrue(String string) {
        String target = new StringBuilder(string).reverse().toString();

        return string.equalsIgnoreCase(target);
    }
}