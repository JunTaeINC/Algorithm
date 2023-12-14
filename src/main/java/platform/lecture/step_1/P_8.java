package platform.lecture.step_1;

import java.util.HashMap;
import java.util.Map;

public class P_8 {

    public static void main(String[] args) {
        System.out.println(solution("abcbbbccaa"));   // 9
        System.out.println(solution("abcde"));        // 1
        System.out.println(solution("ccc"));          // 3
    }

    private static int solution(String str) {
        Map<Character, Integer> temp = new HashMap<>();
        for (char c : str.toCharArray()) {
            temp.put(c, temp.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        boolean hasOdd = false;
        for (int i : temp.values()) {
            if (i % 2 == 0) {
                count += i;
            } else {
                hasOdd = true;
                count += i - 1;
            }
        }

        return hasOdd ? count + 1 : count;
    }
}