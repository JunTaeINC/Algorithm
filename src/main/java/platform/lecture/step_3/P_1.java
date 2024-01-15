package platform.lecture.step_3;

import java.util.Stack;

public class P_1 {

    public static void main(String[] args) {
        // return No
        System.out.println(solution("(()(()))(()"));

        // return Yes
        System.out.println(solution("(())()"));

        // return No
        System.out.println(solution(")()("));
    }

    private static String solution(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else {
                if (stack.isEmpty()) {
                    return "No";
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty() ? "Yes" : "No";
    }
}