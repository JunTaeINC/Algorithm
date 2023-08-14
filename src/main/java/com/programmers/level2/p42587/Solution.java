package com.programmers.level2.p42587;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
	public int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

		for (int p : priorities) {
			queue.add(p);
		}

		while (!queue.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == queue.peek()) {
					queue.poll();
					answer++;
					if (i == location) {
						return answer;
					}
				}
			}
		}
		return answer;
	}
}