package platform.baekjoon.silver.p9017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] rank = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            solution(N, rank);
        }
    }

    private static void solution(int N, int[] rank) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int r : rank) {
            map.put(r, map.getOrDefault(r, 0) + 1);
        }

        List<Integer> members = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == 6) {
                members.add(key);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j : rank) {
            if (members.contains(j)) {
                list.add(j);
            }
        }

        int[][] arr = new int[201][6];
        int winner = 0;
        int minScore = Integer.MAX_VALUE;
        for (int member : members) {
            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (index == 6) break;
                if (member == list.get(i)) {
                    arr[member][index] = i + 1;
                    index++;
                }
            }

            int temp = 0;
            for (int i = 0; i < 4; i++) {
                temp += arr[member][i];
            }

            if (minScore > temp) {
                minScore = temp;
                winner = member;
            } else if (minScore == temp) {
                if (arr[member][4] < arr[winner][4]) {
                    winner = member;
                }
            }
        }

        System.out.println(winner);
    }
}