package platform.lecture.step_3;

import java.util.Stack;

import static java.lang.Math.abs;

public class P_3 {

    public static void main(String[] args) {
        // return [7]
        System.out.println(solution(new int[]{7, 5, -6, -5}));

        // return [-2, -1, -3, 1, 3]
        System.out.println(solution(new int[]{-2, -1, -3, 1, 3}));

        // return [-2, -1, -3, 2]
        System.out.println(solution(new int[]{-2, -1, 2, 1, -3, 2}));
    }

    public static Stack<Integer> solution(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int n : nums) {
            if (stack.isEmpty()) {
                stack.push(n);
            } else {
                if (stack.peek() > 0 && n < 0) {
                    if (stack.peek() > abs(n)) {
                        break;
                    } else if (stack.peek() == abs(n)) {
                        stack.pop();
                    } else {
                        while (!stack.isEmpty() && stack.peek() > 0) {
                            if (stack.peek() == abs(n)) {
                                stack.pop();
                                break;
                            } else if (stack.peek() < abs(n)) {
                                stack.pop();
                            } else {
                                break;
                            }
                        }

                        if (stack.peek() < 0) stack.push(n);
                    }
                } else {
                    stack.push(n);
                }
            }
        }

        return stack;
    }
}