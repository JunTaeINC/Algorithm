package com.programmers.level2.p12909;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	boolean solution(String s) {
		Queue<String> queue = new LinkedList<>();
		char[] chars = s.toCharArray();

		if (chars[0] == ')')
			return false;

		for (char cha : chars) {
			if (cha == '(') {
				queue.add("(");
			} else {
				if (queue.isEmpty()) {
					return false;
				} else {
					queue.poll();
				}
			}
		}
		return queue.isEmpty();
	}
}