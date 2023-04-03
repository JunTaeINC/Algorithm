package study.sort.p42748;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            List<Integer> copy = new ArrayList<>();
            int index = commands[i][0] - 1;
            for (int j = 0; j < commands[i][1] - commands[i][0] + 1; j++) {
                copy.add(array[index]);
                index++;
            }
            Collections.sort(copy);
            answer[i] = copy.get(commands[i][2] - 1);
        }
        return answer;
    }
}