package platform.baekjoon.silver.p10828;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < N; i++) {
			String command = sc.nextLine();

			if (command.contains("push")) {
				int num = Integer.parseInt(command.split(" ")[1]);
				stack.push(num);
			} else if (command.equals("pop")) {
				sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
			} else if (command.equals("size")) {
				sb.append(stack.size()).append('\n');
			} else if (command.equals("empty")) {
				sb.append(stack.isEmpty() ? 1 : 0).append('\n');
			} else if (command.equals("top")) {
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
			}
		}

		System.out.print(sb);

		sc.close();
	}
}