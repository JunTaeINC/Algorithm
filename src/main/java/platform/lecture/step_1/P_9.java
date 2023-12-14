package platform.lecture.step_1;

import java.util.HashMap;
import java.util.Map;

public class P_9 {

    public static void main(String[] args) {
        System.out.println(solution("abcabcdefabc")); // def
        System.out.println(solution("abxdeydeabz"));  // xyz
    }

    private static String solution(String str) {
        String answer = "";
        Map<Character, Integer> words = new HashMap<>();

        for (char c : str.toCharArray()) {
            words.put(c, words.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        for (int v : words.values()) {
            max = Math.max(max, v);
        }

        for (char c : str.toCharArray()) {
            if (words.get(c) != max) answer += c;
        }

        return answer;
    }
}