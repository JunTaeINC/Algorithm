package platform.programmers.level0.p120829;

class Main {
	public static void main(String[] args) {
	}
}

class Solution {
	public int solution(int angle) {
		if (angle == 180)
			return 4;
		if (angle > 90)
			return 3;
		if (angle == 90)
			return 2;
		return 1;
	}
}
