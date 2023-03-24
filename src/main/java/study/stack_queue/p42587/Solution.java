package study.stack_queue.p42587;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

class Solution {
    public static HashMap<Integer,Integer> solution(int location) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int[] priorities = new int[]{1, 1, 9, 1, 1, 1};
        for(int i = 0 ; i < priorities.length ; i++) {
            hashMap.put(priorities[i],i);
        }

        return hashMap;

    }

    public static void main(String[] args) {
        System.out.println(solution(0));

    }
}