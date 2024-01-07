package platform.lecture.step_2;

import java.util.HashSet;
import java.util.Set;

public class P_5 {

    public static void main(String[] args) {
        System.out.println(solution("time to time", 5)); // 12
        System.out.println(solution("time to study", 7)); // -1
        System.out.println(solution("Big Life is Good", 10)); // 16
        System.out.println(solution("Life is Good", 7)); // -1
    }

    private static int solution(String str, int count) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (c == ' ') continue;
            set.add(c);
        }

        return set.size() == count ? str.length() : -1;
    }
}