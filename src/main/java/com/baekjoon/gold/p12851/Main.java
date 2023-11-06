package com.baekjoon.gold.p12851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int max = 100_000;

        boolean[] isVisited = new boolean[max + 1];

        int count = 0;
        int answer = Integer.MAX_VALUE;

        Queue<Place> queue = new LinkedList<>();
        queue.offer(new Place(start, 0));

        while (!queue.isEmpty()) {
            Place place = queue.poll();
            isVisited[place.position] = true;

            if (place.position == target) {
                if (count == 0) answer = place.second;
                if (place.second == answer) count++;
            }


            int[] next = {place.position + 1, place.position - 1, place.position * 2};
            for (int n : next) {
                if (0 <= n && n <= max && !isVisited[n]) {
                    queue.offer(new Place(n, place.second + 1));
                }
            }
        }

        System.out.println(answer + "\n" + count);
    }

    static class Place {
        int position;
        int second;

        public Place(int position, int second) {
            this.position = position;
            this.second = second;
        }
    }
}