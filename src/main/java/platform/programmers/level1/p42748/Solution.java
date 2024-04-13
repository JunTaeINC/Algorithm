package platform.programmers.level1.p42748;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1, end = commands[i][1] - 1, index = commands[i][2] - 1;
            List<Integer> temp = new ArrayList<>();

            for (int j = start; j <= end; j++) {
                temp.add(array[j]);
            }

            Collections.sort(temp);

            answer[i] = temp.get(index);
        }

        return answer;
    }
}