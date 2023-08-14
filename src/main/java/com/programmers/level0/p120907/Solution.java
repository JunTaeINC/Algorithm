package com.programmers.level0.p120907;

class Solution {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			String[] b = quiz[i].split(" ");
			if (b[1].equals("-")) {
				if (Integer.parseInt(b[0]) - Integer.parseInt(b[2]) == Integer.parseInt(b[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			} else {
				if (Integer.parseInt(b[0]) + Integer.parseInt(b[2]) == Integer.parseInt(b[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			}
		}
		return answer;
	}
}