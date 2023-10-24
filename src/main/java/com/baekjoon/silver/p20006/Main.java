package com.baekjoon.silver.p20006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int P = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Player[] players = new Player[P];
        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            players[i] = new Player(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        for (Player base : players) {
            List<Player> room = new ArrayList<>();
            if (!base.flag) {
                for (Player player : players) {
                    if (room.size() == M) break;
                    if (!player.flag && Math.abs(base.level - player.level) <= 10) {
                        player.flag = true;
                        room.add(player);
                    }
                }

                Collections.sort(room);
                sb.append(room.size() == M ? "Started!" : "Waiting!").append("\n");
                for (Player p : room) {
                    sb.append(p.level).append(" ").append(p.nickName).append("\n");
                }
            }
        }

        System.out.println(sb);
    }

    static class Player implements Comparable<Player> {
        int level;
        String nickName;
        boolean flag;

        public Player(int lv, String name) {
            this.level = lv;
            this.nickName = name;
        }

        @Override
        public int compareTo(Player player) {
            return this.nickName.compareTo(player.nickName);
        }
    }
}