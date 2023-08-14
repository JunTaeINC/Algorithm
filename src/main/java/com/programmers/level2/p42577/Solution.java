package com.programmers.level2.p42577;

import java.util.Arrays;
import java.util.HashSet;

class Solution {
	public boolean solution(String[] phone_book) {
		HashSet<String> hashSet = new HashSet<>();

		for (String p : phone_book) {
			hashSet.add(p);
		}

		for (String phone : phone_book) {
			for (int i = 1; i < phone.length(); i++) {
				if (hashSet.contains(phone.substring(0, i))) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean solution_V2(String[] phone_book) {
		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].startsWith(phone_book[i]))
				return false;
		}

		return true;
	}
}