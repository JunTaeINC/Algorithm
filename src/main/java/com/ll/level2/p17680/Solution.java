package com.ll.level2.p17680;

import java.util.Stack;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Stack<String> cache = new Stack<>();

        if(cacheSize == 0) {
            return cities.length * 5;
        }

        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.contains(city)) {
                cache.remove(city);
                cache.push(city);
                answer++;
            } else {
                if (cache.size() >= cacheSize) {
                    cache.remove(0);
                }
                cache.push(city);
                answer += 5;
            }
        }
        return answer;
    }
}