package platform.lecture.step_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P_5 {

    public static void main(String[] args) {
        System.out.println(solution("BACBACCACCBDEDE")); // C
        System.out.println(solution("AAAAABBCCDDDD"));   // A
    }

    private static String solution(String str) {
        HashMap<Character, Integer> chars = new HashMap<>();

        for (char cha : str.toCharArray()) {
            chars.put(cha, chars.getOrDefault(cha, 0) + 1);
        }

        List<Character> keyList = new ArrayList<>(chars.keySet());
        keyList.sort((o1, o2) -> chars.get(o2).compareTo(chars.get(o1)));

        return String.valueOf(keyList.get(0));
    }
}