package com.programmers.level0.p120869;

import java.util.Arrays;

class Solution {
	public int solution(String[] spell, String[] dic) {
		Arrays.sort(spell);
		for (String d : dic) {
			String[] di = d.split("");
			Arrays.sort(di);
			if (spell.length == di.length && String.join("", spell).equals(String.join("", di))) {
				return 1;
			}
		}
		return 2;
	}
}
