package platform.programmers.level2.p12914;

class Solution {
	public long solution(int n) {
		int[] a = new int[2001];
		a[1] = 1;
		a[2] = 2;
		for (int i = 3; i < a.length; i++) {
			a[i] = (a[i - 2] % 1234567) + (a[i - 1] % 1234567);
		}
		return a[n] % 1234567;
	}
}