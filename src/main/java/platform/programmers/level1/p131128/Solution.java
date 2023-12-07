package platform.programmers.level1.p131128;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
	public String solution(String X, String Y) {
		List<String> xx = Arrays.stream(X.split("")).collect(Collectors.toList());
		List<String> yy = Arrays.stream(Y.split("")).collect(Collectors.toList());
		List<String> sum = new ArrayList<>();
		for (String x : xx) {
			if (yy.contains(x)) {
				sum.add(x);
				yy.remove(x);
			}
		}
		String answer = sum.stream()
			.sorted(Comparator.reverseOrder())
			.map(Object::toString)
			.reduce("", (x, y) -> x + y);
		if (sum.isEmpty())
			return "-1";
		if (Integer.parseInt(answer) == 0)
			return "0";
		return answer;
	}
}