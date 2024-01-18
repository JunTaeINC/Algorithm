package platform.lecture.step_3;

import java.util.Stack;

public class P_4 {

    public static void main(String[] args) {
        // return 17
        System.out.println(solution("()(((()())(())()))(())"));

        // return 24
        System.out.println(solution("(((()(()()))(())()))(()())"));
    }

    private static int solution(String intput) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        char prev = '0';

        for (char c : intput.toCharArray()) {
            if (c == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (prev == '(') {
                    count += stack.size();
                } else {
                    count++;
                }
            }

            prev = c;
        }

        return count;
    }
}