package com.programmers.level0.p120883;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public String solution(String[] id_pw, String[][] db) {
		Map<String, String> dbdb = new HashMap<>();

		for (String[] d : db) {
			dbdb.put(d[0], d[1]);
		}

		if (dbdb.containsKey(id_pw[0])) {
			if (dbdb.get(id_pw[0]).equals(id_pw[1])) {
				return "login";
			} else {
				return "wrong pw";
			}
		} else {
			return "fail";
		}
	}
}