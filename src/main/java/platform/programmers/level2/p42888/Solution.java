package platform.programmers.level2.p42888;

import java.util.HashMap;
import java.util.Map;

class Solution {
	public static String[] solution(String[] record) {
		Map<String, String> nicknames = new HashMap<>();
		int msgCount = 0;

		for (String r : record) {
			String[] elements = r.split(" ");
			String action = elements[0];
			String userId = elements[1];

			if (action.equals("Enter") || action.equals("Change")) {
				nicknames.put(userId, elements[2]);
			}

			if (!action.equals("Change")) {
				msgCount++;
			}
		}

		String[] answer = new String[msgCount];

		int index = 0;
		for (String r : record) {
			String[] elements = r.split(" ");
			String action = elements[0];
			String userId = elements[1];
			String nickname = nicknames.get(userId);

			if (action.equals("Enter")) {
				answer[index++] = nickname + "님이 들어왔습니다.";
			} else if (action.equals("Leave")) {
				answer[index++] = nickname + "님이 나갔습니다.";
			}
		}

		return answer;
	}
}