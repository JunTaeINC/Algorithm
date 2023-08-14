package com.programmers.level1.p172928;

import java.util.Arrays;

class Solution {
	public int[] solution(String[] park, String[] routes) {
		int[] start = getStart(park);
		for (String r : routes) {
			start = move(start, park, r);
		}

		return start;
	}

	private int[] move(int[] start, String[] park, String route) {
		int[] newStart = Arrays.copyOf(start, start.length);
		String[] rou = route.split(" ");
		String nswe = rou[0];
		int index = Integer.parseInt(rou[1]);

		for (int i = 0; i < index; i++) {
			if (nswe.equals("N") && newStart[0] - 1 >= 0) {
				newStart[0]--;
			} else if (nswe.equals("S") && newStart[0] + 1 <= park.length - 1) {
				newStart[0]++;
			} else if (nswe.equals("W") && newStart[1] - 1 >= 0) {
				newStart[1]--;
			} else if (nswe.equals("E") && newStart[1] + 1 <= park[0].length() - 1) {
				newStart[1]++;
			} else {
				return start;
			}

			if (park[newStart[0]].charAt(newStart[1]) == 'X') {
				return start;
			}
		}
		return newStart;
	}

	private int[] getStart(String[] arr) {
		int[] start = new int[2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'S') {
					start[0] = i;
					start[1] = j;
				}
			}
		}
		return start;
	}
}