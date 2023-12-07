package platform.programmers.level1.p121688;

import java.util.PriorityQueue;

class Solution {
	public int solution(int[] ability, int number) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int ab : ability) {
			pq.offer(ab);
		}

		while (number > 0) {
			int a = pq.poll();
			int b = pq.poll();

			int sum = a + b;

			pq.offer(sum);
			pq.offer(sum);

			number--;
		}
		return pq.stream().mapToInt(Integer::intValue).sum();
	}

}