package platform.programmers.level2.p49993;

class Solution {
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		for (String skills : skill_trees) {
			String str = skills.replaceAll("[^" + skill + "]", "");

			if (skill.indexOf(str) == 0) {
				answer++;
			}
		}

		return answer;
	}
}