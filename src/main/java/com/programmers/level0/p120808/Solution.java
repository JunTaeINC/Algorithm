package com.programmers.level0.p120808;

class Solution {
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		int lcm = getLcm(denom1, denom2);
		answer[0] = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2));
		answer[1] = lcm;
		int gcd = getGcd(answer[0], answer[1]);
		answer[0] /= gcd;
		answer[1] /= gcd;
		return answer;
	}

	public static int getGcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getGcd(b, a % b);
	}

	public static int getLcm(int a, int b) {
		return (a * b) / getGcd(a, b);
	}

	public static void main(String[] args) {
		System.out.println(getGcd(8, 4));
	}
}