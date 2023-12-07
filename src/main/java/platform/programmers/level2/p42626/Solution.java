package platform.programmers.level2.p42626;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		Queue<Integer> queue = createQueueFromScoville(scoville);

		while (queue.peek() < K) {
			if (queue.size() == 1)
				return -1;

			queue.offer(queue.poll() + (queue.poll() * 2));
			answer++;
		}

		return answer;
	}

	private Queue<Integer> createQueueFromScoville(int[] scoville) {
		Queue<Integer> queue = new PriorityQueue<>();

		for (int s : scoville) {
			queue.offer(s);
		}

		return queue;
	}
}