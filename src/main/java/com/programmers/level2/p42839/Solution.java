package com.programmers.level2.p42839;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    private Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;
        // 1. 무작위 숫자 생성
        rec("", numbers);

        // 2. 소수 찾기
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();

            if (isPrime(num)) answer++;
        }

        // 3. 정답 출력
        return answer;
    }

    private void rec(String comb, String others) {
        if (!comb.equals("")) {
            set.add(Integer.parseInt(comb));
        }

        for (int i = 0; i < others.length(); i++) {
            rec(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;

        int num = (int) Math.sqrt(number);
        for (int i = 2; i <= num; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}