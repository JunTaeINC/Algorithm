package com.programmers.level1.p140108;

class Solution {
	public int solution(String s) {
		int answer = 0;
		int index = 0;
		int length = s.length();

		while (index < length) {
			char cha = s.charAt(index);
			int sameCount = 0;
			int notSameCount = 0;
			while (index < length) {
				char _cha = s.charAt(index);

				if (cha == _cha) {
					sameCount++;
				} else {
					notSameCount++;
				}

				if (sameCount == notSameCount)
					break;
				index++;
			}
			index++;
			answer++;
		}
		return answer;
	}
}