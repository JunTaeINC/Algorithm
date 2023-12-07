package platform.programmers.level0.p120861;

class Solution {
	public int[] solution(String[] keyinput, int[] board) {
		int maxX = (board[0] - 1) / 2;
		int maxY = (board[1] - 1) / 2;
		int[] start = {0, 0};
		//up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다.
		for (String key : keyinput) {
			if (key.equals("up") && Math.abs(start[1]) < maxY) {
				start[1]++;
			} else if (key.equals("down") && Math.abs(start[1]) < maxY) {
				start[1]--;
			} else if (key.equals("left") && Math.abs(start[0]) < maxX) {
				start[0]--;
			} else if (key.equals("right") && Math.abs(start[0]) < maxX) {
				start[0]++;
			}
		}
		return start;
	}
}
