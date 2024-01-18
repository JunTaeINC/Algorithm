package platform.lecture.step_3;

import java.util.Stack;

public class P_5 {

    public static void main(String[] args) {
        // return 7823
        System.out.println(solution("5276823", 3));

        // return 99776
        System.out.println(solution("9977252641", 5));
    }

    private static String solution(String input, int cut) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            while (true) {
                if (cut <= 0 || stack.isEmpty() || stack.peek() >= c) break;
                stack.pop();
                cut--;
            }

            stack.push(c);
        }

        if (cut > 0) {
            for (int i = 0; i < cut; i++) {
                stack.pop();
            }
        }

        for (Character character : stack) {
            answer += character;
        }

        return answer;
    }
}