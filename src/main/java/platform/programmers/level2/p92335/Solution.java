package platform.programmers.level2.p92335;

class Solution {
	private boolean isPrime(long n) {
		if (n <= 1) {
			return false;
		} else if (n == 2) {
			return true;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	private String toBaseK(int n, int k) {
		StringBuilder res = new StringBuilder();

		while (n > 0) {
			res.insert(0, n % k);
			n /= k;
		}

		return res.toString();
	}

	private int countPrimes(String baseK) {
		int start = 0;
		int count = 0;

		while (start < baseK.length()) {
			int end = start + 1;

			while (end < baseK.length() && baseK.charAt(end) != '0') {
				end++;
			}
			if (isPrime(Long.parseLong(baseK.substring(start, end)))) {
				count++;
			}
			start = end;
		}

		return count;
	}

	public int solution(int n, int k) {
		String baseK = toBaseK(n, k);
		return countPrimes(baseK);
	}
}