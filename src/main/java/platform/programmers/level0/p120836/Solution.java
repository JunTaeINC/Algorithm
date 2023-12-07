package platform.programmers.level0.p120836;

class Main {
	public static void main(String[] args) {
	}
}

class Solution {
	public int solution(int n) {
		int ans = 0;
		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0) {
				ans++;
			}
		}
		return ans;
	}
}