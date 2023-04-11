package study.bfs.p86491;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int solution(int[][] sizes) {
        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        for (int[] size : sizes) {
            zero.add(Math.min(size[0], size[1]));
            one.add(Math.max(size[0], size[1]));
        }
        zero.sort(Collections.reverseOrder());
        one.sort(Collections.reverseOrder());
        return zero.get(0) * one.get(0);
    }
}
