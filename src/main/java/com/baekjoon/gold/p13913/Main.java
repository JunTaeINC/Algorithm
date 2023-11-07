package com.baekjoon.gold.p13913;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int max = 100_000;
        boolean[] isVisited = new boolean[max + 1];
        int[] positions = new int[max + 1];

        Queue<Place> queue = new LinkedList<>();
        queue.offer(new Place(start, 0));
        isVisited[start] = true;

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Place place = queue.poll();

            if (place.position == target) {
                sb.append(place.second).append("\n");
                break;
            }

            int[] next = {place.position + 1, place.position - 1, place.position * 2};

            for (int n : next) {
                if (0 <= n && n <= max && !isVisited[n]) {
                    isVisited[n] = true;
                    positions[n] = place.position;
                    queue.offer(new Place(n, place.second + 1));
                }
            }
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(target);

        int index = target;
        while (index != start) {
            stack.push(positions[index]);
            index = positions[index];
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        System.out.println(sb);
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