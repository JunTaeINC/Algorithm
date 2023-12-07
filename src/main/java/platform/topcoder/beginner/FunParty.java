package platform.topcoder.beginner;

import java.util.HashMap;
import java.util.Map;

public class FunParty {

	public static int solution_v1(String[] first, String[] second) {
		int answer = 0;

		for (int i = 0; i < first.length; i++) {
			int f = 0;
			int s = 0;

			for (int j = 0; j < first.length; j++) {
				if (first[i].equals(first[j])) f++;
				if (first[i].equals(second[j])) f++;
				if (second[i].equals(first[j])) s++;
				if (second[i].equals(second[j])) s++;
			}

			answer = Math.max(answer, f);
			answer = Math.max(answer, s);
		}

		return answer;
	}

	public static int solution_v2(String[] first, String[] second) {
		Map<String, Integer> map = new HashMap<>();
		int answer = 0;

		for (int i = 0; i < first.length; i++) {
			map.put(first[i], map.getOrDefault(first[i], 0) + 1);
			map.put(second[i], map.getOrDefault(second[i], 0) + 1);
		}

		for (String k : map.keySet()) {
			answer = Math.max(answer, map.get(k));
		}

		return answer;
	}

	public static void main(String[] args) {
		// test case 2
		// return : 3
		String[] first = new String[] {"snakes", "programming", "cobra", "monty"};
		String[] second = new String[] {"python", "python", "anaconda", "python"};

		System.out.println(solution_v2(first, second));
	}
}