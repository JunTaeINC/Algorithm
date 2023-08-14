package com.programmers.level2.p42583;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> queue = new LinkedList<>();
		int time = 0;
		int sum = 0;
		for (int truck : truck_weights) {
			while (true) {
				if (queue.isEmpty()) {
					queue.offer(truck);
					sum += truck;
					time++;
					break;
				} else if (queue.size() == bridge_length) {
					sum -= queue.poll();
				} else {
					if (sum + truck <= weight) {
						queue.offer(truck);
						sum += truck;
						time++;
						break;
					} else {
						queue.offer(0);
						time++;
					}
				}
			}
		}

		return time + bridge_length;
	}

}