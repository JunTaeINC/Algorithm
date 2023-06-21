package com.ll.level1.p42576;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> a = Arrays.stream(participant).sorted().collect(Collectors.toList());
        List<String> b = Arrays.stream(completion).collect(Collectors.toList());

        b.add(" ");
        Collections.sort(b);

        for(int i = 0 ; i < a.size() ; i++) {
            if(!a.get(i).equals(b.get(i))) {
                answer = a.get(i);
            }
        }

        return answer;
    }
}