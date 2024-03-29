package platform.programmers.level1.p12915;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings);
		Arrays.sort(strings, Comparator.comparing(s -> s.substring(n, n + 1)));
		return strings;
	}
}