package study.hash.p1845;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            if (!numList.contains(num)) numList.add(num);
        }
        if (numList.size() >= nums.length / 2) {
            return nums.length / 2;
        } else {
            return numList.size();
        }
    }
}