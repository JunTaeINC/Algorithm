package study.p42576;

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 해시 생성
        //   이름  , 사람수
        Map<String, Integer> player = new HashMap<>();
        // 참가자 해시에 추가 하기
        for (String par : participant) {
            // 참가자가 이름이 같을 시 사람수 추가
            if (player.containsKey(par)) {
                player.put(par, player.get(par) + 1);
            } else {
                // 없을시 해시에 넣기
                player.put(par, 1);
            }
        }
        for (String com : completion) {
            // 완주 한 사람 이름의 인구수 빼기
            if (player.containsKey(com)) player.put(com, player.get(com) - 1);
        }
        for (String key : player.keySet()) {
            // 범인 검거
            if (player.get(key) != 0) answer += key;
        }
        return answer;
    }
}
