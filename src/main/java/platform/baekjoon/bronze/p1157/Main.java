package platform.baekjoon.bronze.p1157;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T = sc.next().toUpperCase();

        Map<Character, Integer> map = new TreeMap<>();

        int maxCount = 0;
        char answer = '?';

        for (int i = 0; i < T.length(); i++) {
            char temp = T.charAt(i);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            if (map.get(temp) > maxCount) {
                maxCount = map.get(temp);
                answer = temp;
            }
        }

        for (char c : map.keySet()) {
            if (c == answer) continue;
            if (map.get(c) == maxCount) {
                answer = '?';
                break;
            }
        }

        System.out.println(answer);
    }
}