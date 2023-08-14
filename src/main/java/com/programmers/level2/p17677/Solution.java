package com.programmers.level2.p17677;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(String str1, String str2) { //65536
		List<String> list1 = getStrList(str1);
		List<String> list2 = getStrList(str2);

		int sameCount = 0;
		int sum = list1.size() + list2.size();

		for (String str : list1) {
			if (list2.contains(str)) {
				list2.remove(str);
				sameCount++;
			}
		}

		sum -= sameCount;
		double result = (sum == 0) ? 1 : (double)sameCount / sum;

		return (int)(result * 65536);
	}

	private static List<String> getStrList(String str) {
		List<String> list = new ArrayList<>();
		str = str.toLowerCase();

		for (int i = 0; i < str.length() - 1; i++) {
			char cha1 = str.charAt(i);
			char cha2 = str.charAt(i + 1);

			if (Character.isLetter(cha1) && Character.isLetter(cha2)) {
				list.add("" + cha1 + cha2);
			}
		}

		return list;
	}
}