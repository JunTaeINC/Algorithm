package platform.lecture.step_1;

import java.util.HashMap;
import java.util.Map;

public class P_6 {

    public static void main(String[] args) {
        System.out.println(solution("statitsics"));      // 3
        System.out.println(solution("aabb"));            // -1
        System.out.println(solution("stringshowtime"));  // 3
    }

    private static int solution(String str) {
        Map<Character, Integer> words = new HashMap<>();

        for (char cha : str.toCharArray()) {
            words.put(cha, words.getOrDefault(cha, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (words.get(str.charAt(i)) == 1) {
                return i + 1;
            }
        }

        return -1;
    }
}