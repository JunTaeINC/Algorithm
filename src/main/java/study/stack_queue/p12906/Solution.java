package study.stack_queue.p12906;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>();
        numList.add(arr[0]);
        for (int ar : arr) {
            if (numList.get(numList.size() - 1) != ar) numList.add(ar);
        }
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}