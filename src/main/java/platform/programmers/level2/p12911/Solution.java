package platform.programmers.level2.p12911;

class Solution {
	public int solution(int n) {
		long nCount = Integer.bitCount(n);
		int next = n + 1;
		while (true) {
			if (nCount == Integer.bitCount(next))
				break;
			next++;
		}
		return next;
	}
}