package platform.topcoder.beginner;

import java.util.Arrays;

public class Cryptography {

	public static long solution_v1(int[] numbers) {
		long answer = 0;

		for (int i = 0; i < numbers.length; i++) {
			int multiplication = 1;

			for (int j = 0; j < numbers.length; j++) {
				if (i == j) {
					multiplication *= (numbers[j] + 1);
				} else {
					multiplication *= numbers[j];
				}
			}

			answer = Math.max(answer, multiplication);
		}

		return answer;
	}

	public static long solution_v2(int[] numbers) {
		long answer = 1;
		Arrays.sort(numbers);
		numbers[0]++;

		for (int number : numbers) {
			answer *= number;
		}

		return answer;
	}

	public static void main(String[] args) {
		// test case 1
		// return 36
		int[] numbers = new int[] {1, 3, 2, 1, 1, 3};
		System.out.println(solution_v2(numbers));
	}
}