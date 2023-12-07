package platform.programmers.level2.p42586;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
	public static int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < progresses.length; i++) {
			int remainder = 100 - progresses[i];
			if (remainder % speeds[i] == 0) {
				queue.add(remainder / speeds[i]);
			} else {
				queue.add((remainder / speeds[i]) + 1);
			}
		}

		while (!queue.isEmpty()) {
			int count = 1;
			int f = queue.poll();

			while (!queue.isEmpty()) {
				if (f < queue.peek())
					break;
				count++;
				queue.poll();
			}
			answer.add(count);
		}

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}