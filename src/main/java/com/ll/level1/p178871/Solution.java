package com.ll.level1.p178871;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String call : callings) {
            int index = map.get(call);
            String user = players[index - 1];

            players[index - 1] = call;
            players[index] = user;

            map.put(call, index - 1);
            map.put(user, index);
        }
        return players;
    }
}