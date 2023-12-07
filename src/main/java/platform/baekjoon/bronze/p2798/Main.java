package platform.baekjoon.bronze.p2798;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();

		int[] arr = new int[x];

		for (int i = 0; i < x; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println(search(arr, x, y));
	}

	private static int search(int[] arr, int x, int y) {
		int target = 0;

		for (int i = 0; i < x - 2; i++) {
			for (int j = i + 1; j < x - 1; j++) {
				for (int k = j + 1; k < x; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if (sum == y) {
						return y;
					}

					if (target < sum && sum < y) {
						target = sum;
					}
				}
			}
		}
		return target;
	}
}