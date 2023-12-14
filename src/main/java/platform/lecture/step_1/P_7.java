package platform.lecture.step_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P_7 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("aaabc"))); // 0,2,2
        System.out.println(Arrays.toString(solution("aabb")));  // 0,0,2
        System.out.println(Arrays.toString(solution("abc")));   // 0,0,0
    }

    private static int[] solution(String str) {
        Map<Character, Integer> words = new HashMap<>();

        for (char c : str.toCharArray()) {
            words.put(c, words.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        for (int v : words.values()) {
            max = Math.max(max, v);
        }

        int index = 0;
        int[] answer = new int[3];
        for (char c : "abc".toCharArray()) {
            answer[index++] = max - words.getOrDefault(c, 0);
        }

        return answer;
    }
}