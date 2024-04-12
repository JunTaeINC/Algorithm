package platform.baekjoon.silver.p1935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Double> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        double[] numbers = new double[N];
        String rpn = br.readLine();

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        stack = new Stack<>();

        for (char c : rpn.toCharArray()) {
            if ('A' <= c && c <= 'Z') {
                stack.push(numbers[c - 'A']);
            } else {
                calculate(c);
            }
        }

        System.out.printf("%.2f", stack.pop());
    }

    private static void calculate(char operator) {
        double val2 = stack.pop();
        double val1 = stack.pop();

        switch (operator) {
            case '*' -> stack.push(val1 * val2);
            case '/' -> stack.push(val1 / val2);
            case '-' -> stack.push(val1 - val2);
            case '+' -> stack.push(val1 + val2);
        }
    }
}