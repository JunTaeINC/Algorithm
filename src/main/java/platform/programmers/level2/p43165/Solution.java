package platform.programmers.level2.p43165;

class Solution {
	private int answer;

	public int solution(int[] numbers, int target) {
		dfs(numbers, target, 0, 0);
		return answer;
	}

	private void dfs(int[] numbers, int target, int index, int sum) {
		if (index == numbers.length) {
			if (sum == target)
				answer++;
		} else {
			dfs(numbers, target, index + 1, sum + numbers[index]);
			dfs(numbers, target, index + 1, sum - numbers[index]);
		}
	}
}