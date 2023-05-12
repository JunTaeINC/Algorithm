package com.ll.level2.p64065;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int[] solution(String s) {
        Set<String> set = new LinkedHashSet<>();
        String[] arr = s.substring(2, s.length() - 2).split("},\\{");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        for (int i = 0; i < arr.length; i++) {
            set.addAll(Arrays.asList(arr[i].split(",")));
        }
        return set.stream().mapToInt(Integer::parseInt).toArray();
    }
}