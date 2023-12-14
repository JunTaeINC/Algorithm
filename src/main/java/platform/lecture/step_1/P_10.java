package platform.lecture.step_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P_10 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"steasue", "sasseysu", "kseseas"}));  // ["s", "s", "e", "a"]
        System.out.println(solution(new String[]{"ackky", "kabck", "yokkcs"}));        // ["k", "k", "c"]
        System.out.println(solution(new String[]{"longlong", "longtong", "longbig"})); // ["l", "o", "n", "g", "g"]
    }

    private static List<Character> solution(String[] words) {
        List<Character> answer = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : words[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> temp = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                if (map.getOrDefault(c, 0) > 0) {
                    temp.put(c, temp.getOrDefault(c, 0) + 1);
                    map.put(c, map.get(c) - 1);
                }
            }

            map = temp;
        }

        for (char c : map.keySet()) {
            for (int i = 0; i < map.get(c); i++) {
                answer.add(c);
            }
        }

        return answer;
    }
}