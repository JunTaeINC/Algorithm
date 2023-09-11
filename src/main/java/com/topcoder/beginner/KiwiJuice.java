package com.topcoder.beginner;

import java.util.Arrays;

public class KiwiJuice {
	public static int[] solution_v1(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for (int i = 0; i < fromId.length; i++) {
			int from = fromId[i];
			int to = toId[i];

			int emptySpace = capacities[to] - bottles[to];

			if (emptySpace >= bottles[from]) {
				bottles[to] += bottles[from];
				bottles[from] = 0;
			} else {
				bottles[to] += emptySpace;
				bottles[from] -= emptySpace;
			}
		}

		return bottles;
	}

	public static int[] solution_v2(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for (int i = 0; i < fromId.length; i++) {
			int from = fromId[i];
			int to = toId[i];
			/*
			  bottles[from] = 옮길 주스의 양
			  capacities[to] - bottles[to] = 옮겨질 주스의 남은 공간
			*/
			int value = Math.min(bottles[from], capacities[to] - bottles[to]);

			bottles[from] -= value;
			bottles[to] += value;
		}

		return bottles;
	}

	public static int[] solution_v3(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		for (int i = 0; i < fromId.length; i++) {
			int from = fromId[i];
			int to = toId[i];
			/*
			  기존 주스 : Math.min(옮길 주스와 기존 주스의 총합, 기존 주스의 용량)
			  옮길 주스 : 옮길 주스와 기존 주스의 총합 - 위의 걀과 값
			*/
			int sum = bottles[from] + bottles[to];
			bottles[to] = Math.min(sum, capacities[to]);
			bottles[from] = sum - bottles[to];
		}

		return bottles;
	}

	public static void main(String[] args) {
		// test case 2
		int[] a = new int[] {30, 20, 10};
		int[] b = new int[] {10, 5, 5};
		int[] c = new int[] {0, 1, 2};
		int[] d = new int[] {1, 2, 0};

		System.out.println(Arrays.toString(solution_v3(a, b, c, d)));
	}
}