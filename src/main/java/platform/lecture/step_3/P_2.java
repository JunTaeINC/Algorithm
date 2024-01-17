package platform.lecture.step_3;

import java.util.Stack;

public class P_2 {

    public static void main(String[] args) {
        // return EFLM
        System.out.println(solution("(A(BC)D)EF(G(H)(IJ)K)LM(N)"));
    }

    private static String solution(String input) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if(c == '(') {
                stack.push('(');
            } else if ( c == ')') {
                stack.pop();
            } else {
                if(stack.isEmpty()) answer += c;
            }
        }
        return answer;
    }
}