package study.bfs.p42840;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) score[0]++;
            if (answers[i] == two[i % 8]) score[1]++;
            if (answers[i] == three[i % 10]) score[2]++;
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if (maxScore == score[i]) answer.add(i + 1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
}