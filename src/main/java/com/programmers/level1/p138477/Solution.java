package com.programmers.level1.p138477;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < score.length; i++) {
			if (list.size() < k) {
				list.add(score[i]);
				Collections.sort(list);
				answer[i] = list.get(0);
			} else if (list.size() == k) {
				int minNumber = list.get(0);

				if (minNumber < score[i]) {
					list.remove(0);
					list.add(score[i]);
					Collections.sort(list);
				}
				answer[i] = list.get(0);
			}
		}
		return answer;
	}
}