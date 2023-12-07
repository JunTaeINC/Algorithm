package platform.programmers.level2.p12953;

class Solution {
	public int solution(int[] arr) {
		int lcm = 1;
		for (int a : arr) {
			lcm = leastCommonMultiple(lcm, a);
		}
		return lcm;
	}

	private int greatestCommonDivisor(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private int leastCommonMultiple(int a, int b) {
		return (a * b) / greatestCommonDivisor(a, b);
	}

}